package com.jayden.a3_behavior.a7_visitor.a1_thoery;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //德芙巧克力,生产日期2002-5-1 ,原价 10元
        Candy candy = new Candy("德芙巧克力", LocalDate.of(2022,5,1),10.0);

        Visitor visitor = new DiscountVisitor(LocalDate.of(2022,10,11));
        visitor.visit(candy);
    }
}
