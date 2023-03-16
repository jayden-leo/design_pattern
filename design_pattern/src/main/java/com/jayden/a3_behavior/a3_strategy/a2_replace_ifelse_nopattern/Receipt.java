package com.jayden.a3_behavior.a3_strategy.a2_replace_ifelse_nopattern;

/**
 * 回执信息
 **/
public class Receipt {

    private String message; //回执信息

    private String type; //回执类型(MT1101、MT2101、MT4101、MT8104)

    public Receipt() {
    }

    public Receipt(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}