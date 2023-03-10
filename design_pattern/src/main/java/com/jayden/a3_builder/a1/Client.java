package com.jayden.a3_builder.a1;

import com.jayden.a3_builder.a1.builder.Builder;
import com.jayden.a3_builder.a1.director.Director;
import com.jayden.a3_builder.a1.builder.impl.HelloBuilder;
import com.jayden.a3_builder.a1.builder.impl.MobikeBuilder;
import com.jayden.a3_builder.a1.product.Bike;

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
