package com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern;

public class Test {
    public static void main(String[] args) {
        LotteryService ls = new LotteryServiceImpl();
        LotteryResult result  = ls.lottery("1234567887654322");
        System.out.println(result);
    }
}
