package com.jayden.a2_structurer.a1_proxy.a3_dynamic_cglib_proxy;

import java.util.Collections;
import java.util.List;

/**
 * 目标类
 */
public class UserServiceImpl {

    // 查询功能
    public List<User> findUserList(){

        return Collections.singletonList(new User("tom","23"));
    }
}
