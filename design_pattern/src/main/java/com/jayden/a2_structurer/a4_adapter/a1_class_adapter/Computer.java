package com.jayden.a2_structurer.a4_adapter.a1_class_adapter;

public class Computer {
    public String read(SDCard sdCard){
        String data = sdCard.readSD();
        return data;
    }
}
