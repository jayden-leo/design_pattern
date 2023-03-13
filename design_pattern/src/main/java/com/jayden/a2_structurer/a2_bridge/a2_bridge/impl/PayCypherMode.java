package com.jayden.a2_structurer.a2_bridge.a2_bridge.impl;

import com.jayden.a2_structurer.a2_bridge.a2_bridge.IPayMode;

//密码支付及风控校验
public class PayCypherMode implements IPayMode {

    @Override
    public boolean security(String uId) {
        System.out.println("密码支付,风控校验-环境安全");
        return false;
    }
}