package com.jayden.a3_behavior.a1_observer.a3_lottery_number;

import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.DrawHouseService;
import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.LotteryResult;

import java.util.Date;

/**
 * 开奖服务
 **/
public class LotteryServiceImpl extends LotteryService {

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        return new LotteryResult(uId,result,new Date());
    }
}