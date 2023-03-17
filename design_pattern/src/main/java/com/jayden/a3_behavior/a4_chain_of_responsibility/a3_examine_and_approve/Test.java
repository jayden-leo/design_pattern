package com.jayden.a3_behavior.a4_chain_of_responsibility.a3_examine_and_approve;

import com.jayden.a3_behavior.a4_chain_of_responsibility.a2_examine_and_approve_nopattern.AuthService;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import net.sf.json.JSONArray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) throws ParseException {

        AuthLink authLink = new Level3AuthLink("1000013", "王工")
                .appendNext(new Level2AuthLink("1000012", "张经理")
                        .appendNext(new Level1AuthLink("1000011", "段总")));

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = f.parse("2020-11-18 23:49:46");

        logger.debug("测试结果：{}", JSONArray.fromObject(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.debug("测试结果：{}", "模拟三级负责人审批，王工");
        logger.debug("测试结果：{}", JSONArray.fromObject(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.debug("测试结果：{}", "模拟二级负责人审批，张经理");
        logger.debug("测试结果：{}", JSONArray.fromObject(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.debug("测试结果：{}", "模拟一级负责人审批，段总");
        logger.debug("测试结果：{}", JSONArray.fromObject(authLink.doAuth("研发牛马", "1000998004813441", currentDate)));

    }
}
