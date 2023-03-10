package com.jayden.a1_creater.a2_factory.entity;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private String status; // 状态码
    private String message; // 信息
    private T data;

    public ResponseResult(String status,String message){
        this.status = status;
        this.message = message;
    }

    public ResponseResult(String status,String message, T data){
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
