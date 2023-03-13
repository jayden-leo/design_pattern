package com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory.factoryImpl;

import com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory.AbstractFreezer;
import com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory.AbstractTV;
import com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory.AppliancesFactory;
import com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory.impl.HisenseFreezer;
import com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory.impl.HisenseTV;

public class HisenseFactory implements AppliancesFactory {

    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}