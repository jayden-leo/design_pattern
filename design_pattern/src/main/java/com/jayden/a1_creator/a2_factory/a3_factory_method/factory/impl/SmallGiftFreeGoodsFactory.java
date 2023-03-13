package com.jayden.a1_creator.a2_factory.a3_factory_method.factory.impl;

import com.jayden.a1_creator.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a1_creator.a2_factory.a2_simple_factory.service.impl.SmallGiftFreeGoods;
import com.jayden.a1_creator.a2_factory.a3_factory_method.factory.FreeGoodsFactory;

public class SmallGiftFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new SmallGiftFreeGoods();
    }
}
