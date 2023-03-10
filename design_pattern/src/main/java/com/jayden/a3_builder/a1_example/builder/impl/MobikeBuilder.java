package com.jayden.a3_builder.a1_example.builder.impl;

import com.jayden.a3_builder.a1_example.product.Bike;
import com.jayden.a3_builder.a1_example.builder.Builder;

public class MobikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
