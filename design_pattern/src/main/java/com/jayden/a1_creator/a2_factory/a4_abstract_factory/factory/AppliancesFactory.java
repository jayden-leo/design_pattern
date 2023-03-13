package com.jayden.a1_creator.a2_factory.a4_abstract_factory.factory;

/**
 * 抽象工厂: 在一个抽象工厂中可以声明多个工厂方法,用于创建不同类型的产品
 **/
public interface AppliancesFactory {

    AbstractTV createTV();

    AbstractFreezer createFreezer();
}