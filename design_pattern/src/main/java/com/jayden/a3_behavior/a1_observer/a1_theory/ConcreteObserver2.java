package com.jayden.a3_behavior.a1_observer.a1_theory;

/**
 * 具体观察者
 **/
public class ConcreteObserver2 implements Observer{

    @Override
    public void update() {
        //获取消息通知,执行业务代码
        System.out.println("ConcreteObserver2 得到通知!");
    }
}
