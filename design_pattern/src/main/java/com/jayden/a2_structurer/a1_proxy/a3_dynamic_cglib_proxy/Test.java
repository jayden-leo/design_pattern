package com.jayden.a2_structurer.a1_proxy.a3_dynamic_cglib_proxy;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 目标对象
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());
        // 代理对象
        UserServiceImpl proxy =(UserServiceImpl) new UserLogProxy(userService).getLogProxy();
        System.out.println(proxy.getClass());

        List<User> userList = proxy.findUserList();
        System.out.println("用户信息: "+userList);
    }
}