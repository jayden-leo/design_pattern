package com.jayden.a2_structurer.a1_proxy.a1_example;

public class UserDaoProxy implements IUserDao{

    private IUserDao target;

    public UserDaoProxy(IUserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("开启事务"); //扩展额外的功能
        target.save();
        System.out.println("提交事务");
    }
}
