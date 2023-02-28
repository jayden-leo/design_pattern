package com.jayden.a1_singleton;

/**
 * 单例模式-懒汉式(双重校验)
 *      特点: 即可以实现延时加载,又可以实现高并发.
 *      缺点: 但是还是线程不安全,由于JVM底层为了减少指向的特点,会打乱下面123的顺序,可能会132的实行顺序,
 *           当一个线程在3步骤完成后,还没有初始化对象就被其他线程抢到,然后判断实例不为空,但是此时还没有初始化,是个半成品所以会有问题
 *           所以需要加一个volatile来保证这个对象是被初始化的才行.此时问题时代码复杂.
 *           可能会被反射和序列化破坏
 */
public class A4_Singleton {
    // 1 私有构造方法
    private A4_Singleton() {

    }

    // 2 在本类中创建私有静态的全局对象
    private static volatile  A4_Singleton a4_singleton;

    // 3 通过加锁来保证调用此方法的唯一性
    public static A4_Singleton getInstance() {
        // 第一次判断,如果instance不为空,不进入抢锁阶段,直接返回实例
        if (a4_singleton == null) {
            synchronized (A4_Singleton.class) {
                // 第二次判断,抢到锁之后再次进行判断,判断是否为null
                if (a4_singleton == null) {
                    a4_singleton = new A4_Singleton();
                    /**
                     * 上面创建对象的代码,在JVM中被分为三步:
                     *      1.分配内存空间
                     *      2.初始化对象
                     *      3.将instance志向分配好的内存空间
                     */
                }
            }

        }
        return a4_singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                A4_Singleton a4_singleton = A4_Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "------" + a4_singleton);
            }).start();
        }
    }
}
