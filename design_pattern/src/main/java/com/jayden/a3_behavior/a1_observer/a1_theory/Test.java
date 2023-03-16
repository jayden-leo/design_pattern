package com.jayden.a3_behavior.a1_observer.a1_theory;

public class Test {
    public static void main(String[] args) {
        //创建目标类(被观察者)
        ConcreteSubject subject = new ConcreteSubject();

        //注册观察者类,可以注册多个
        subject.attach(new ConcreteObserver1());
        subject.attach(new ConcreteObserver2());

        //具体主题的内部状态发生改变时，给所有注册过的观察者发送通知。
        subject.notifyObservers();
    }
}
