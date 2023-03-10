package com.jayden.a1_creater.a2_factory.a3_factory_method.controller;

import com.jayden.a1_creater.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a1_creater.a2_factory.a3_factory_method.factory.FreeGoodsFactory;
import com.jayden.a1_creater.a2_factory.a3_factory_method.factory.FreeGoodsFactoryMap;
import com.jayden.a1_creater.a2_factory.entity.AwardInfo;
import com.jayden.a1_creater.a2_factory.entity.ResponseResult;

/**
 * 发放奖品接口
 **/
public class DeliverController {

    /**
     * 按照类型的不同发放商品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo){

        //根据类型获取工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardType());

        //从工厂中获取对应实例
        IFreeGoods freeGoods = goodsFactory.getInstance();

        System.out.println("=====工厂方法模式========");
        ResponseResult result = freeGoods.sendFreeGoods(awardInfo);
        return result;
    }
}