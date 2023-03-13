package com.jayden.a1_creator.a2_factory.a3_factory_method.factory;

import com.jayden.a1_creator.a2_factory.a3_factory_method.factory.impl.DiscountFreeGoodsFactory;
import com.jayden.a1_creator.a2_factory.a3_factory_method.factory.impl.SmallGiftFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 用简单方法模式实现: 工厂的工厂,作用是不需要每次创建新的工厂对象
 **/
public class FreeGoodsFactoryMap {

    private static final Map<Integer,FreeGoodsFactory> cachedFactories = new HashMap<>();

    static{
        cachedFactories.put(1, new DiscountFreeGoodsFactory());
        cachedFactories.put(2, new SmallGiftFreeGoodsFactory());
    }

    public static FreeGoodsFactory getParserFactory(Integer type){
        if (cachedFactories.get(type)!=null){
            FreeGoodsFactory freeGoodsFactory = cachedFactories.get(type);
            return freeGoodsFactory;
        }

        return null;
    }
}