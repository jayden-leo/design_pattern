package com.jayden.a3_behavior.a2_template.a1_theory;

public class ConcreteClassA extends AbstractClassTemplate{

    @Override
    void step3() {
        System.out.println("在子类A中 -> 执行步骤 3");
    }

    @Override
    void step4() {
        System.out.println("在子类A中 -> 执行步骤 4");
    }
}