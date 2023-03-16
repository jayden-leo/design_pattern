package com.jayden.a3_behavior.a2_template.a1_theory;

public class Test {
    public static void main(String[] args) {
        AbstractClassTemplate concreteClassA = new ConcreteClassA();
        concreteClassA.run("");

        System.out.println("===========");

        AbstractClassTemplate concreteClassB = new ConcreteClassB();
        concreteClassB.run("x");
    }
}
