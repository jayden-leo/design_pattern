package com.jayden.a2_structurer.a1_proxy.a3_dynamic_cglib_proxy;

import lombok.Data;

@Data
public class User {

    private String name;
    private String age;

    public User(String name,String age){
        this.name = name;
        this.age = age;
    }

}
