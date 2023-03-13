package com.jayden.a2_structurer.a4_adapter.a1_class_adapter;

/**
 * TF卡接口
 **/
public interface TFCard {

    //读取TF卡方法
    String readTF();
    //写入TF卡功能
    void writeTF(String msg);
}
