package com.jayden.a2_structurer.a2_bridge.a2_bridge;

/**
 * 支付模式接口
 **/
public interface IPayMode {

    //安全校验功能: 对各种支付模式进行风控校验
    boolean security(String uId);
}
