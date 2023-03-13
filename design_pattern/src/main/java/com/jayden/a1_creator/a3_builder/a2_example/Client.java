package com.jayden.a1_creator.a3_builder.a2_example;

public class Client {

    public static void main(String[] args) {

        //使用链式编程设置参数
        RabbitMQClientBuilder client = new RabbitMQClientBuilder.Builder()
                                        .setHost("192.168.52.123")
                                        .setMode(2)
                                        .setExchange("text-exchange")
                                        .setPort(5672)
                                        .setDurable(true)
                                        .build();

        client.sendMessage("Test");
    }
}
