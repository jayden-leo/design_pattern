package com.jayden.a2_factory.a2_simple_factory.controller;

import com.jayden.a2_factory.a2_simple_factory.factory.FreeGoodsFactory;
import com.jayden.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a2_factory.entity.AwardInfo;
import com.jayden.a2_factory.entity.ResponseResult;

public class DeliverController {

    //发放奖品
    public ResponseResult awardToUser(AwardInfo awardInfo){

        try {
            IFreeGoods freeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardType());
            ResponseResult responseResult = freeGoods.sendFreeGoods(awardInfo);
            return responseResult;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseResult("201","奖品发放失败!");
        }
    }
}
