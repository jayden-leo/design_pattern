package com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern;

import java.util.Date;

/**
 * 开奖服务
 **/
public class LotteryServiceImpl implements LotteryService {

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        //发短信
        System.out.println("发送短信通知用户ID为: " + uId + ",您的摇号结果如下: " + result);

        //发送MQ消息
        System.out.println("记录用户摇号结果(MQ), 用户ID:" +  uId + ",摇号结果:" + result);

        return new LotteryResult(uId,result,new Date());
    }
}