package com.jayden.a2_structurer.a2_bridge.a2_bridge.impl;

import com.jayden.a2_structurer.a2_bridge.a2_bridge.IPayMode;

//指纹支付及风控校验
public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付,风控校验-指纹信息");
        return true;
    }
}