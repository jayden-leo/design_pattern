package com.jayden.a1_creater.a2_factory.a4_abstract_factory.controller;

import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.AbstractFreezer;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.AbstractTV;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.AppliancesFactory;
import com.jayden.a1_creater.a2_factory.a4_abstract_factory.factory.factoryImpl.HisenseFactory;

public class Client {
    private AbstractTV tv;

    private AbstractFreezer freezer;

    public Client(AppliancesFactory factory){

        //在客户端看来就是使用抽象工厂来生产家电
        this.tv = factory.createTV();
        this.freezer = factory.createFreezer();
    }

    public AbstractTV getTv() {
        return tv;
    }

    public void setTv(AbstractTV tv) {
        this.tv = tv;
    }

    public AbstractFreezer getFreezer() {
        return freezer;
    }

    public void setFreezer(AbstractFreezer freezer) {
        this.freezer = freezer;
    }

    public static void main(String[] args) {

        Client client = new Client(new HisenseFactory());
        AbstractTV tv = client.getTv();
        System.out.println(tv);

        AbstractFreezer freezer = client.getFreezer();
        System.out.println(freezer);
    }
}
