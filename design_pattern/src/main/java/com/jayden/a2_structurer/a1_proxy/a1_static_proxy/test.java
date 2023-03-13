package com.jayden.a2_structurer.a1_proxy.a1_static_proxy;

import org.junit.Test;

public class test {

    /**
     * 静态代理
     * - 优点：可以在不修改目标对象的前提下扩展目标对象的功能。
     * - 缺点：
     *   1. 冗余。由于代理对象要实现与目标对象一致的接口，会产生过多的代理类。
     *   2. 不易维护。一旦接口增加方法，目标对象与代理对象都要进行修改。
     */
    @Test
    public void testStaticProxy(){
        // 目标类
        IUserDao dao = new UserDaoImpl();

        // 代理对象
        UserDaoProxy proxy = new UserDaoProxy(dao);

        proxy.save();
    }
}
