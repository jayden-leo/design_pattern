package com.jayden.a1_creater.a2_factory.a3_factory_method.factory.impl;

import com.jayden.a1_creater.a2_factory.a2_simple_factory.service.IFreeGoods;
import com.jayden.a1_creater.a2_factory.a2_simple_factory.service.impl.DiscountFreeGoods;
import com.jayden.a1_creater.a2_factory.a3_factory_method.factory.FreeGoodsFactory;

public class DiscountFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInstance() {
        return new DiscountFreeGoods();
    }
}
