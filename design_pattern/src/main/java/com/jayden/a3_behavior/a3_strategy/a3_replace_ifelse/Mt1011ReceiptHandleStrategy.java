package com.jayden.a3_behavior.a3_strategy.a3_replace_ifelse;

import com.jayden.a3_behavior.a3_strategy.a2_replace_ifelse_nopattern.Receipt;

public class Mt1011ReceiptHandleStrategy implements ReceiptHandleStrategy {

    @Override
    public void handleReceipt(Receipt receipt) {
        System.out.println("解析报文MT1011: " + receipt.getMessage());
    }
}