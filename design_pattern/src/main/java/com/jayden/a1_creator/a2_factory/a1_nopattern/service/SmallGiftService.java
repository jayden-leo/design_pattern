package com.jayden.a1_creator.a2_factory.a1_nopattern.service;

import com.jayden.a1_creator.a2_factory.entity.SmallGiftInfo;

public class SmallGiftService {
    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo){

        System.out.println("小礼品已发货,获奖用户注意查收! " +  smallGiftInfo);
        return true;
    }
}
