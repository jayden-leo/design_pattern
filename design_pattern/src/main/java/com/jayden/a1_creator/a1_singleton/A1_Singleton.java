package com.jayden.a1_creator.a1_singleton;

/**
 * 单例模式: 饿汉式
 *      在 类加载期间 初始化私有的静态实例, 保证instance实例创建过程中是线程安全的
 *      特点: 不支持延时加载,获取实例对象的速度比较快
 *      缺点: 但是如果对象比较大,而且一直没有使用的话就会造成内存的浪费
 *           可能会被反射和序列化破坏
 */
public class A1_Singleton {

    // 1 私有构造方法
    private A1_Singleton(){

    }

    // 2 在本类中创建私有静态的全局对象
    private static A1_Singleton instance = new A1_Singleton();

    // 3 创建静态方法得到这个对象
    public static A1_Singleton getInstance(){
        return instance;
    }


    public static void main(String[] args){
        A1_Singleton instance1 = A1_Singleton.getInstance();
        A1_Singleton instance2 = A1_Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}
