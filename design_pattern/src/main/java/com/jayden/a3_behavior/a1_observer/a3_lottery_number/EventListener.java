package com.jayden.a3_behavior.a1_observer.a3_lottery_number;

import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.LotteryResult;

/**
 * 事件监听接口
 **/
public interface EventListener {

    void doEvent(LotteryResult result);
}
