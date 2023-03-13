package com.jayden.a2_structurer.a4_adapter.a2_object_adapter;

import com.jayden.a2_structurer.a4_adapter.a1_class_adapter.*;

public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.read(sdCard));

        System.out.println("========================");
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF adapterTF = new SDAdapterTF(tfCard);
        System.out.println(computer.read(adapterTF));
    }
}