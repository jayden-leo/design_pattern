package com.jayden.a2_structurer.a7_flyweight.a2_five_in_a_row;

/**
 * 抽象享元类: 五子棋类
 **/
public abstract class GobangFlyweight {

    public abstract String getColor();

    public void display(){
        System.out.println("棋子颜色: " + this.getColor());
    }
}
