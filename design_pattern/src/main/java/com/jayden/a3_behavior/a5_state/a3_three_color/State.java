package com.jayden.a3_behavior.a5_state.a3_three_color;

/**
 * 交通灯状态接口
 **/
public interface State {

    void switchToGreen(TrafficLight trafficLight); //切换为绿灯

    void switchToYellow(TrafficLight trafficLight); //切换为黄灯

    void switchToRed(TrafficLight trafficLight); //切换为红灯
}