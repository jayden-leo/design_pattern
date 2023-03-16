package com.jayden.a3_behavior.a3_strategy.a3_replace_ifelse;

import com.jayden.a3_behavior.a3_strategy.a2_replace_ifelse_nopattern.Receipt;

/**
 * 上下文类,持有策略接口
 **/
public class ReceiptStrategyContext {

    private ReceiptHandleStrategy receiptHandleStrategy;

    public void setReceiptHandleStrategy(ReceiptHandleStrategy receiptHandleStrategy) {
        this.receiptHandleStrategy = receiptHandleStrategy;
    }

    //调用策略类中的方法
    public void handleReceipt(Receipt receipt){
        if(null !=receipt){
            receiptHandleStrategy.handleReceipt(receipt);
        }
    }
}