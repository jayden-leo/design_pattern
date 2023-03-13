package com.jayden.a1_creator.a2_factory.a3_factory_method.controller;

import com.jayden.a1_creator.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a1_creator.a2_factory.a3_factory_method.factory.FreeGoodsFactory;
import com.jayden.a1_creator.a2_factory.a3_factory_method.factory.impl.DiscountFreeGoodsFactory;
import com.jayden.a1_creator.a2_factory.a3_factory_method.factory.impl.SmallGiftFreeGoodsFactory;
import com.jayden.a1_creator.a2_factory.entity.AwardInfo;
import com.jayden.a1_creator.a2_factory.entity.ResponseResult;

public class DeliverControllerNo {

    /**
     * 按照类型的不同发放商品
     */
    public ResponseResult awardToUser(AwardInfo awardInfo){

        FreeGoodsFactory freeGoodsFactory = null;

        if(awardInfo.getAwardType() == 1){

            freeGoodsFactory = new DiscountFreeGoodsFactory();
        }else if(awardInfo.getAwardType() == 2){

            freeGoodsFactory = new SmallGiftFreeGoodsFactory();
        }

        IFreeGoods freeGoods = freeGoodsFactory.getInstance();

        System.out.println("=====工厂方法模式========");
        ResponseResult result = freeGoods.sendFreeGoods(awardInfo);

        return result;
    }
}
