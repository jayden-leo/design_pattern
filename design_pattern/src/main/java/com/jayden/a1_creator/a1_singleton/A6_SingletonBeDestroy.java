package com.jayden.a1_creator.a1_singleton;

import java.lang.reflect.Constructor;

/**
 * 反射对单例的破坏
 */
public class A6_SingletonBeDestroy {
    public static void main(String[] args) throws Exception {
        // 反射中, 欲获取一个类或者调用某个类的方法, 首先要获取到该类的Class对象
        Class<A5_Singleton> clazz = A5_Singleton.class;
        // getDeclaredXxx: 不受权限控制的获取类的成员
        Constructor<A5_Singleton> c = clazz.getDeclaredConstructor();
        // 设置为true, 就可以对类中的私有成员进行操作了
        c.setAccessible(true);
        A5_Singleton instance1 = c.newInstance();
        A5_Singleton instance2 = c.newInstance();
        System.out.println(instance1==instance2);
        // 解决方法是在单例类的私有构造方法中添加instance!=null时抛出异常即可,但是代码简洁性遭到破坏,不够优雅
    }
}
