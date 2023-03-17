package com.jayden.a3_behavior.a5_state.a1_theory;

/**
 * 抽象状态接口
 **/
public interface State {

    //声明抽象方法,不同具体状态类可以有不同实现
    public void handle(Context context);
}