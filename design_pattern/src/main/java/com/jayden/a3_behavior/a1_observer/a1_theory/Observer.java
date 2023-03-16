package com.jayden.a3_behavior.a1_observer.a1_theory;

/**
 * 抽象目标类
 **/
public interface Observer {

    //update方法: 为不同观察者的更新(响应)行为定义相同的接口,不同的观察者对该方法有不同的实现
    public void update();
}
