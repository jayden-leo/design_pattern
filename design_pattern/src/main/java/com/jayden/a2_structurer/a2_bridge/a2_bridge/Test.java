package com.jayden.a2_structurer.a2_bridge.a2_bridge;

import com.jayden.a2_structurer.a2_bridge.a2_bridge.impl.PayFaceMode;
import com.jayden.a2_structurer.a2_bridge.a2_bridge.impl.PayFingerprintMode;
import com.jayden.a2_structurer.a2_bridge.a2_bridge.impl.WxPay;
import com.jayden.a2_structurer.a2_bridge.a2_bridge.impl.ZfbPay;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        System.out.println("测试场景1: 微信支付、人脸方式.");
        Pay wxpay = new WxPay(new PayFaceMode());
        wxpay.transfer("wx_00100100","10001900",new BigDecimal(100));

        System.out.println();

        System.out.println("测试场景2: 支付宝支付、指纹方式");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu1234567","567689999999",new BigDecimal(200));
    }
}
