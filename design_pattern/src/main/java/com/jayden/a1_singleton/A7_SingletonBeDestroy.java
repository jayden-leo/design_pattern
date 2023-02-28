package com.jayden.a1_singleton;

import java.io.*;

/**
 * 序列化对于单例的破坏
 */
public class A7_SingletonBeDestroy {
    public static void main(String[] args) throws Exception {
        //序列化对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Singleton.getInstance());

        //序列化对象输入流
        File file = new File("tempFile.obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton Singleton = (Singleton) ois.readObject();

        System.out.println(Singleton);
        System.out.println(Singleton.getInstance());

        //判断是否是同一个对象
        System.out.println(Singleton.getInstance() == Singleton);//false
    }
}

/**
 * 单例类实现序列化接口
 */
class Singleton implements Serializable {

    private Singleton() {

    }

    /**
     * 解决方案:只要在Singleton类中定义readResolve就可以解决该问题
     * 程序会判断是否有readResolve方法,如果存在就在执行该方法,如果不存在--就创建一个对象
     */
    private Object readResolve() {
        return singleton;
    }

    private volatile static Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}