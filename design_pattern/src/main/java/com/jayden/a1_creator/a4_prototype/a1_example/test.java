package com.jayden.a1_creator.a4_prototype.a1_example;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test {
    @Test
    public void test01() throws CloneNotSupportedException {
        ConcretePrototype c1 = new ConcretePrototype();
        ConcretePrototype c2 = c1.clone();

        System.out.println("对象c1和c2是同一个对象？" + (c1 == c2));
    }

    @Test
    public void test02() throws CloneNotSupportedException {
        ConcretePrototype c1 = new ConcretePrototype();
        Person p1 = new Person("jayden");
        c1.setPerson(p1);

        //复制c1
        ConcretePrototype c2 = c1.clone();
        //获取复制对象c2中的Person对象
        Person p2 = c2.getPerson();
        p2.setName("峰哥");

        //判断p1与p2是否是同一对象
        System.out.println("p1和p2是同一个对象？" + (p1 == p2));

        c1.show();
        c2.show();
    }

    @Test
    public void test03() throws Exception {

        ConcretePrototype c1 = new ConcretePrototype();
        Person p1 = new Person("峰哥");
        c1.setPerson(p1);

        //创建对象序列化输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c.txt"));

        //将c1对象写到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象序列化输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c.txt"));

        //读取对象
        ConcretePrototype c2 = (ConcretePrototype) ois.readObject();
        Person p2 = c2.getPerson();
        p2.setName("凡哥");

        //判断p1与p2是否是同一个对象
        System.out.println("p1和p2是同一个对象?" + (p1 == p2));

        c1.show();
        c2.show();
    }
}
