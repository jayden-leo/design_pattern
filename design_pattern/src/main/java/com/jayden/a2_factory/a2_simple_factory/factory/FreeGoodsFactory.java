package com.jayden.a2_factory.a2_simple_factory.factory;

import com.jayden.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a2_factory.a2_simple_factory.service.impl.DiscountFreeGoods;
import com.jayden.a2_factory.a2_simple_factory.service.impl.SmallGiftFreeGoods;
import com.jayden.a2_factory.a2_simple_factory.service.impl.YouKuMemberFreeGoods;

/**
 * 具体工厂: 生成免费商品
 **/
public class FreeGoodsFactory {

    public static IFreeGoods getInstance(Integer awardType){

        IFreeGoods iFreeGoods = null;

        if(awardType == 1){  //打折券
            iFreeGoods = new DiscountFreeGoods();
        }else if(awardType == 2){ //优酷会员

            iFreeGoods = new YouKuMemberFreeGoods();
        }else if(awardType == 3){ //小礼品

            iFreeGoods = new SmallGiftFreeGoods();
        }

        return iFreeGoods;
    }
}
