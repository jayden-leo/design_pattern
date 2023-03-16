package com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern;

/**
 * 开奖服务接口
 **/
public interface LotteryService {

    //摇号相关业务
    public LotteryResult lottery(String uId);
}