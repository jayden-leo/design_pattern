package com.jayden.a1_creater.a1_singleton;

/**
 * 单例模式: 懒汉式
 *      特点: 支持延时加载, 只有在调用getInstance时,才会创建对象.
 *      缺点: 但是线程不安全,比如当一个线程通过if后,刚好被其他线程抢,并且此时实例也是空,生成一个实例后,
 *           之前的这个线程又实例化了一个.可能会被反射和序列化破坏
 */
public class A2_Singleton {

    // 1 私有构造方法
    private A2_Singleton(){

    }

    // 2 在本类中创建私有静态的全局对象
    private static A2_Singleton a2_singleton;

    // 3 通过判断对象是否被初始化来判断是否创建对象
    public static A2_Singleton getInstance(){
        if (a2_singleton==null){
            a2_singleton = new A2_Singleton();
        }
        return a2_singleton;
    }

    public static void main(String[] args){
        for (int i=0;i<100;i++){
            new Thread(()->{
                A2_Singleton a2_singleton= A2_Singleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"------"+a2_singleton);
            }).start();
        }
    }
}
