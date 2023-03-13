package com.jayden.a2_structurer.a7_flyweight.a1_example;

/**
 * 非共享具体享元类
 **/
public class UnsharedConcreteFlyweight extends Flyweight {

    private String intrinsicState;

    public UnsharedConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }


    @Override
    public void operation(String extrinsicState) {
        System.out.println("=== 使用不共享对象,内部状态: " + intrinsicState +",外部状态: " + extrinsicState);
    }
}