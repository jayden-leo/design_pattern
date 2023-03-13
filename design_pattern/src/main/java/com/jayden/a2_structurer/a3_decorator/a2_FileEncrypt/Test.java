package com.jayden.a2_structurer.a3_decorator.a2_FileEncrypt;

public class Test {

    public static void main(String[] args) {

        String info = "name:tom,age:15";
        DataLoaderDecorator decorator = new EncryptionDataDecorator(new BaseFileDataLoader("demo.txt"));
        decorator.write(info);

        String data = decorator.read();
        System.out.println(data);
    }
}
