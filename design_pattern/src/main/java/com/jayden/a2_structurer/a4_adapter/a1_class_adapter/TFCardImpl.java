package com.jayden.a2_structurer.a4_adapter.a1_class_adapter;

/**
 * TF卡实现类
 **/
public class TFCardImpl implements TFCard {

    @Override
    public String readTF() {

        String msg = "tf card reading data";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write data : " + msg);
    }
}