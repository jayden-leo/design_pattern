package com.jayden.a1_creater.a1_singleton;

/**
 * 单例模式-懒汉式(静态内部类)
 *      特点: 根据静态内部类的特性,既可以实现延时加载,又可以实现高并发.
 *      缺点: 可能会被反射和序列化破坏
 */
public class A5_Singleton {
    private A5_Singleton(){
        if (SingleHandler.a5_singleton!=null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    //创建静态内部类
    private static class SingleHandler{
        //在静态内部类中创建单例,在装载内部类的时候,才会创建单例对象
        private static A5_Singleton a5_singleton = new A5_Singleton();
    }

    public static A5_Singleton getInstance(){
        return SingleHandler.a5_singleton;
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
