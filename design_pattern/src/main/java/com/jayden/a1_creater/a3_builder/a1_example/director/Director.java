package com.jayden.a1_creater.a3_builder.a1_example.director;

import com.jayden.a1_creater.a3_builder.a1_example.product.Bike;
import com.jayden.a1_creater.a3_builder.a1_example.builder.Builder;

public class Director {

    private Builder mBuilder;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public Bike construct() {
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
