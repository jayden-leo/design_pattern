package com.jayden.a3_behavior.a3_strategy.a3_replace_ifelse;

import com.jayden.a3_behavior.a3_strategy.a2_replace_ifelse_nopattern.Receipt;

/**
 * 回执处理策略接口
 **/
public interface ReceiptHandleStrategy {

    void handleReceipt(Receipt receipt);
}