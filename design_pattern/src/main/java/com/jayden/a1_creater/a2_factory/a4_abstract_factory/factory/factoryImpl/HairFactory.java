package com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.factoryImpl;

import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.AbstractFreezer;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.AbstractTV;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.AppliancesFactory;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.impl.HairFreezer;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.impl.HairTV;

public class HairFactory implements AppliancesFactory {

    @Override
    public AbstractTV createTV() {
        return new HairTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }
}