package com.jayden.a3_behavior.a3_strategy.a1_theory;

public class Test {
    public static void main(String[] args) {
        Strategy strategyA  = new ConcreteStrategyA();
        Context context = new Context(strategyA); //可以在运行时指定类型,通过配置文件+反射机制实现
        context.algorithm();
    }
}
