package com.jayden.a3_behavior.a4_chain_of_responsibility.a2_examine_and_approve_nopattern;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 模拟审核服务
 **/
public class AuthService {

    //审批信息 审批人Id+申请单Id
    private static Map<String, Date> authMap = new HashMap<String, Date>();

    /**
     * 审核流程
     * @param uId    审核人id
     * @param orderId  审核单id
     */
    public static void auth(String uId, String orderId){
        System.out.println("进入审批流程,审批人ID: " + uId);
        authMap.put(uId.concat(orderId),new Date());
    }

    //查询审核结果
    public static Date queryAuthInfo(String uId, String orderId){
        return authMap.get(uId.concat(orderId)); //key=审核人id+审核单子id
    }
}