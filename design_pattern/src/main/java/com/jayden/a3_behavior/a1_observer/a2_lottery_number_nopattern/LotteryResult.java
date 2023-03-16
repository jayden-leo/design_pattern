package com.jayden.a3_behavior.a1_observer.a2_lottery_number_nopattern;

import lombok.Data;

import java.util.Date;

@Data
public class LotteryResult {

    private String uId; // 用户id
    private String msg; // 摇号信息
    private Date dataTime; // 业务时间

    public LotteryResult(String uId, String msg, Date dataTime) {
        this.uId = uId;
        this.msg = msg;
        this.dataTime = dataTime;
    }
}