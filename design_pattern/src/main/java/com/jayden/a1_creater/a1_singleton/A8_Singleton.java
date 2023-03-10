package com.jayden.a1_creater.a1_singleton;

/**
 * 单例模式(枚举)
 *      特点: 最推荐使用, 代码简洁的情况下又可以解决延时加载, 高并发.
 *           而且还不会被反射和序列化破坏
 */
public enum  A8_Singleton {
    INSTANCE;
    private Object data;

    public Object getData(){
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public static A8_Singleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                A8_Singleton a8_singleton = A8_Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + "------" + a8_singleton);
            }).start();
        }
    }

}
