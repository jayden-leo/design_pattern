package com.jayden.a3_behavior.a1_observer.a3_lottery_number;

import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.LotteryResult;

/**
 * 开奖服务接口
 **/
public abstract class LotteryService{

    private EventManager eventManager;

    public LotteryService(){
        //设置事件类型
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        //订阅
        eventManager.subscribe(EventManager.EventType.Message,new MessageEventListener());
        eventManager.subscribe(EventManager.EventType.MQ,new MQEventListener());
    }

    public LotteryResult lotteryAndMsg(String uId){
        LotteryResult result = lottery(uId);
        //发送通知
        eventManager.notify(EventManager.EventType.Message,result);
        eventManager.notify(EventManager.EventType.MQ,result);

        return result;
    }

    public abstract LotteryResult lottery(String uId);
}

