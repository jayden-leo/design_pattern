package com.jayden.a3_behavior.a5_state.a1_theory;

public class ConcreteStateB implements State {

    @Override
    public String toString() {
        return "当前状态: ConcreteStateB";
    }

    @Override
    public void handle(Context context) {
        System.out.println("进入状态模式B......");
        context.setCurrentState(this);
    }
}