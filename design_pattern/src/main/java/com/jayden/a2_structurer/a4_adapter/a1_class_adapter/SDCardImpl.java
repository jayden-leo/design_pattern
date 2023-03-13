package com.jayden.a2_structurer.a4_adapter.a1_class_adapter;

/**
 * SD卡实现类
 **/
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "sd card reading data";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("sd card write data : " + msg);
    }
}
