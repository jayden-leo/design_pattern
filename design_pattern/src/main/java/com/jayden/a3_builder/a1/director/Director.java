package com.jayden.a3_builder.a1.director;

import com.jayden.a3_builder.a1.product.Bike;
import com.jayden.a3_builder.a1.builder.Builder;

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
