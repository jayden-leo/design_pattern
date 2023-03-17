package com.jayden.a3_behavior.a5_state.a3_three_color;

import com.jayden.a3_behavior.a5_state.a2_three_color_nopattern.TrafficLight;

public class Test {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToRed();
    }
}
