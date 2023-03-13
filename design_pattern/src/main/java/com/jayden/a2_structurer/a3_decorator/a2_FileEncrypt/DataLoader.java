package com.jayden.a2_structurer.a3_decorator.a2_FileEncrypt;

/**
 * 抽象的文件读取接口DataLoader
 **/
public interface DataLoader {

    public String read();

    public void write(String data);
}