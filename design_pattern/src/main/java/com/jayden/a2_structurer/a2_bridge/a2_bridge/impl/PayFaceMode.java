package com.jayden.a2_structurer.a2_bridge.a2_bridge.impl;

import com.jayden.a2_structurer.a2_bridge.a2_bridge.IPayMode;

//刷脸支付及风控校验
public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("人脸支付,风控校验-脸部识别");
        return true;
    }
}