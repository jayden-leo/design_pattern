package com.jayden.a2_structurer.a1_proxy.a3_dynamic_cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserLogProxy implements MethodInterceptor {

    /**
     * 生成CGLIIB动态代理类方法
     * @param target  需要被代理的目标类
     * @return java.lang.Object  代理类对象
     */
    private Object target;

    public UserLogProxy(Object target) {
        this.target = target;
    }

    public Object getLogProxy(){

        //增强器类,用来创建动态代理类
        Enhancer en = new Enhancer();

        //设置代理类的父类字节码对象
        en.setSuperclass(target.getClass());

        //设置回调: 对于代理类上所有的方法的调用,都会调用CallBack,而Callback则需要实现intercept()方法进行拦截
        en.setCallback(this);

        //创建动态代理对象并返回
        return en.create();
    }

    /**
     * 实现回调方法
     * @param o     代理对象
     * @param method  目标对象中的方法的Method实例
     * @param args      实际参数
     * @param methodProxy  代理对象中的方法的method实例
     * @return: java.lang.Object
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(formatter.format(calendar.getTime()) + " [" +method.getName() + "] 查询用户信息...]");

        Object result = methodProxy.invokeSuper(o, args);
        return result;
    }
}
