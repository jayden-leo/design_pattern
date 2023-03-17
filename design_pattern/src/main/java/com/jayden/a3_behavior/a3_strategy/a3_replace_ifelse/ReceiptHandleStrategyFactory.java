package com.jayden.a3_behavior.a3_strategy.a3_replace_ifelse;

import java.util.HashMap;
import java.util.Map;

public class ReceiptHandleStrategyFactory {

    public ReceiptHandleStrategyFactory() {
    }

    //使用Map集合存储策略信息,彻底消除if...else
    private static Map<String,ReceiptHandleStrategy> strategyMap;

    //初始化具体策略,保存到map集合
    public static void init(){
        strategyMap = new HashMap<>();
        strategyMap.put("MT1011",new Mt1011ReceiptHandleStrategy());
        strategyMap.put("MT2101",new Mt2101ReceiptHandleStrategy());
//        SAXReader reader = new SAXReader();
//        String file = "D:\\A3_MAC\\design_pattern\\design_pattern\\src\\main\\java\\com\\jayden\\a3_behavior\\a3_strategy\\a3_replace_ifelse\\config.xml";
//        try {
//            Document document = reader.read(file);
//            Node node = document.selectSingleNode("/config/className");
//            String className = node.getText();
//            Class clazz = Class.forName(className);
//            ReceiptHandleStrategy strategy =(ReceiptHandleStrategy) clazz.newInstance();
//            strategyMap.put("MT1101",strategy);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    //根据回执类型获取对应策略类对象
    public static ReceiptHandleStrategy getReceiptHandleStrategy(String receiptType){
        return strategyMap.get(receiptType);
    }
}