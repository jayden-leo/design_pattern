package com.jayden.a2_structurer.a5_facade.a2_furniture_control;

public class Test {

    public static void main(String[] args) {
        //创建外观对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();

        facade.say("打开家电");
        facade.say("关闭家电");
    }
}