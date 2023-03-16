package com.jayden.a3_behavior.a3_strategy.a3_replace_ifelse;

import com.jayden.a3_behavior.a3_strategy.a2_replace_ifelse_nopattern.Receipt;
import com.jayden.a3_behavior.a3_strategy.a2_replace_ifelse_nopattern.ReceiptBuilder;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //模拟回执
        List<Receipt> receiptList = ReceiptBuilder.genReceiptList();

        //策略上下文
        ReceiptStrategyContext context = new ReceiptStrategyContext();

        //策略模式将策略的 定义、创建、使用这三部分进行了解耦
        for (Receipt receipt : receiptList) {
            //获取置策略
            ReceiptHandleStrategyFactory.init();
            ReceiptHandleStrategy strategy = ReceiptHandleStrategyFactory.getReceiptHandleStrategy(receipt.getType());
            //设置策略
            context.setReceiptHandleStrategy(strategy);
            //执行策略
            context.handleReceipt(receipt);
        }
    }
}
