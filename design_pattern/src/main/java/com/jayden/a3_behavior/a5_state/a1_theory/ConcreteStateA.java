package com.jayden.a3_behavior.a5_state.a1_theory;

public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("进入状态模式A......");
        context.setCurrentState(this);
    }

    @Override
    public String toString() {
        return "当前状态: ConcreteStateA";
    }
}
