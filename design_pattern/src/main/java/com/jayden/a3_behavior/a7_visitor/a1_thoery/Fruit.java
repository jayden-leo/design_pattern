package com.jayden.a3_behavior.a7_visitor.a1_thoery;

import java.time.LocalDate;

/**
 * 水果类
 **/
public class Fruit extends Product{

    //重量
    private float weight;

    public Fruit(String name, LocalDate producedDate, double price, float weight) {
        super(name, producedDate, price);
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}