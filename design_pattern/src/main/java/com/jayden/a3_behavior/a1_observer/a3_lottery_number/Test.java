package com.jayden.a3_behavior.a1_observer.a3_lottery_number;

import com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern.LotteryResult;

public class Test {
    public static void main(String[] args) {
        LotteryService ls = new LotteryServiceImpl();
        LotteryResult result = ls.lotteryAndMsg("1234567887654322");
        System.out.println(result);
    }
}
