package com.jayden.a2_structurer.a4_adapter.a2_object_adapter;

import com.jayden.a2_structurer.a4_adapter.a1_class_adapter.SDCard;
import com.jayden.a2_structurer.a4_adapter.a1_class_adapter.TFCard;

public class SDAdapterTF implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}