package com.jayden.a3_behavior.a1_observer.a1_theory;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
