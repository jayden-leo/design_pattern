package com.jayden.a3_behavior.a5_state.a1_theory;

import lombok.Data;

/**
 * 上下文类
 **/
@Data
public class Context {

    private State currentState; //维持一个对状态对象的引用

    public Context() {
        this.currentState = null;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Context{" +
                "currentState=" + currentState +
                '}';
    }
}
