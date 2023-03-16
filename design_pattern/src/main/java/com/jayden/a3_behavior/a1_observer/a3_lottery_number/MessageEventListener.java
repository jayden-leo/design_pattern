package com.jayden.a3_behavior.a1_observer.a3_lottery_number;


import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.LotteryResult;

/**
 * 短信发送事件
 **/
public class MessageEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("发送短信通知用户ID为: " + result.getUId() +
                ",您的摇号结果如下: " + result.getMsg());
    }
}