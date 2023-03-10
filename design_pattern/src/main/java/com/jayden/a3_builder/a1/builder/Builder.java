package com.jayden.a3_builder.a1.builder;

import com.jayden.a3_builder.a1.product.Bike;

public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
