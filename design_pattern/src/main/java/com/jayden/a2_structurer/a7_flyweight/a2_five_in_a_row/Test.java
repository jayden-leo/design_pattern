package com.jayden.a2_structurer.a7_flyweight.a2_five_in_a_row;

public class Test {

    public static void main(String[] args) {

        //获取享元工厂对象
        GobangFactory instance = GobangFactory.getInstance();

        //获取3颗黑子
        GobangFlyweight b1 = instance.getGobang("b");
        GobangFlyweight b2 = instance.getGobang("b");
        GobangFlyweight b3 = instance.getGobang("b");
        System.out.println("判断两颗黑子是否相同: " + (b1 == b2));

        //获取2颗白子
        GobangFlyweight w1 = instance.getGobang("w");
        GobangFlyweight w2 = instance.getGobang("w");
        System.out.println("判断两颗白子是否相同: " + (w1 == w2));

        //显示棋子
        b1.display();
        b2.display();
        b3.display();
        w1.display();
        w2.display();
    }
}