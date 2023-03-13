package com.jayden.a2_structurer.a3_decorator.a2_FileEncrypt;

/**
 * 装抽象饰者类
 **/
public class DataLoaderDecorator implements DataLoader {

    private DataLoader wrapper;

    public DataLoaderDecorator(DataLoader wrapper) {
        this.wrapper = wrapper;
    }

    public String read() {
        return wrapper.read();
    }

    public void write(String data) {
        wrapper.write(data);
    }
}