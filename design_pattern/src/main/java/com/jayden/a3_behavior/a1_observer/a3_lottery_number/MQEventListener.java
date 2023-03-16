package com.jayden.a3_behavior.a1_observer.a3_lottery_number;

import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.LotteryResult;

/**
 * MQ消息发送事件
 **/
public class MQEventListener implements EventListener {

    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录用户摇号结果(MQ), 用户ID:" +  result.getUId() +
                ",摇号结果:" + result.getMsg());
    }
}