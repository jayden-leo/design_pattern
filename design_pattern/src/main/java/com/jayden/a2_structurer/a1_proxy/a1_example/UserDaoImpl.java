package com.jayden.a2_structurer.a1_proxy.a1_example;

public class UserDaoImpl implements  IUserDao{
    @Override
    public void save() {
        System.out.println("保存数据");
    }
}
