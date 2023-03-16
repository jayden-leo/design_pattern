package com.jayden.a3_behavior.a1_observer.a1_theory;

import java.util.ArrayList;

/**
 * 具体目标类
 **/
public class ConcreteSubject implements Subject {

    //定义集合,存储所有观察者对象
    private ArrayList<Observer> observers = new ArrayList<>();


    //注册方法,向观察者集合中增加一个观察者
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //注销方法,用于从观察者集合中删除一个观察者
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知方法
    @Override
    public void notifyObservers() {
        //遍历观察者集合,调用每一个观察者的响应方法
        for (Observer obs : observers) {
            obs.update();
        }
    }
}