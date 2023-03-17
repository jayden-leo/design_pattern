package com.jayden.a3_behavior.a7_visitor.a1_thoery;

import java.time.LocalDate;

/**
 * 酒水类
 **/
public class Wine extends Product{

    public Wine(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }
}