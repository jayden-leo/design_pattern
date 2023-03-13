package com.jayden.a2_structurer.a7_flyweight.a1_example;

public class Test {
    public static void main(String[] args) {
        //获取工厂类型
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a1 = flyweightFactory.getFlyweight("A");
        a1.operation("a1 exState");
        Flyweight a2 = flyweightFactory.getFlyweight("A");
        a2.operation("a2 exState");
        System.out.println(a1 == a2);  //做到了复用

    }
}
