package com.jayden.a3_builder.a1_example.builder;

import com.jayden.a3_builder.a1_example.product.Bike;

public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
