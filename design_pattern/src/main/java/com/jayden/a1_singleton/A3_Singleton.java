package com.jayden.a1_singleton;

/**
 * 单例模式-懒加载(线程安全)
 *      特点: 线程安全的延时加载
 *      缺点: 但是效率低,每次只能有一个线程调用getInstance方法
 *           可能会被反射和序列化破坏
 */
public class A3_Singleton {
    // 1 私有构造方法
    private A3_Singleton() {

    }

    // 2 在本类中创建私有静态的全局对象
    private static A3_Singleton a3_singleton;

    // 3 通过加锁来保证调用此方法的唯一性
    public static synchronized A3_Singleton getInstance() {
        if (a3_singleton == null) {
            a3_singleton = new A3_Singleton();
        }
        return a3_singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            new Thread(() -> {
                A3_Singleton a3_singleton = A3_Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "------" + a3_singleton);
            }).start();
        }
    }
}
