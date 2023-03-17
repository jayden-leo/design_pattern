package com.jayden.a3_behavior.a4_chain_of_responsibility.a1_theroy;

public class HandlerB extends Handler {

    @Override
    public void handle(RequestData requestData) {
        System.out.println("HandlerB 执行代码逻辑! 处理: " + requestData.getData());

        requestData.setData(requestData.getData().replace("B",""));

        if(successor != null){
            successor.handle(requestData);
        }else{
            System.out.println("执行中止!");
        }
    }
}