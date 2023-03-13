package com.jayden.a1_creator.a2_factory.a1_primal_method.service;

import com.jayden.a1_creator.a2_factory.entity.ResponseResult;

public class DiscountService {

    public ResponseResult sendDiscount(String uid,String number){
        System.out.println("向用户发放打折券一张: " + uid + " , " + number);
        return new ResponseResult("200","发放打折券成功");
    }
}
