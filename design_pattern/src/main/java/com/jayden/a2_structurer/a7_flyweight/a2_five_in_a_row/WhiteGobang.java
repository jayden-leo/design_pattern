package com.jayden.a2_structurer.a7_flyweight.a2_five_in_a_row;

/**
 * 共享享元类-白色棋子
 **/
public class WhiteGobang extends GobangFlyweight{

    @Override
    public String getColor() {
        return "白色";
    }
}