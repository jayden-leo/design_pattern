package com.jayden.a3_behavior.a7_visitor.A2_shopping;


import com.jayden.a3_behavior.a7_visitor.a1_thoery.Product;
import com.jayden.a3_behavior.a7_visitor.a1_thoery.Visitor;

import java.time.LocalDate;

/**
 * 糖果类
 **/
public class Candy extends Product implements Acceptable{
    public Candy(String name, LocalDate producedDate, double price) {
        super(name, producedDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        //accept实现方法中调用访问者并将自己 "this" 传回。this是一个明确的身份,不存在任何泛型
//        visitor.visit(this);
    }
}

//酒水与水果类同样实现Acceptable接口,重写accept方法