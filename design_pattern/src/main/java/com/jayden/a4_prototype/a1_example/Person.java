package com.jayden.a4_prototype.a1_example;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {

    private String name;

    public Person(String name) {
        this.name = name;
    }
}
