package com.jayden.a1_creator.a3_builder.a1_example;

import com.jayden.a1_creator.a3_builder.a1_example.builder.Builder;
import com.jayden.a1_creator.a3_builder.a1_example.director.Director;
import com.jayden.a1_creator.a3_builder.a1_example.builder.impl.HelloBuilder;
import com.jayden.a1_creator.a3_builder.a1_example.builder.impl.MobikeBuilder;
import com.jayden.a1_creator.a3_builder.a1_example.product.Bike;

public class Client {
    public static void main(String[] args) {
        showBike(new HelloBuilder());
        showBike(new MobikeBuilder());
    }

    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
