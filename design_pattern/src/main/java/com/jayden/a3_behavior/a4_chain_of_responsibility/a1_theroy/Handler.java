package com.jayden.a3_behavior.a4_chain_of_responsibility.a1_theroy;

/**
 * 抽象处理者类
 **/
public abstract class Handler {

    protected Handler successor = null;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handle(RequestData requestData);
}