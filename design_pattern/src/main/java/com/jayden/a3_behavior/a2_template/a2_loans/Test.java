package com.jayden.a3_behavior.a2_template.a2_loans;

public class Test {
    public static void main(String[] args) {
        Account a1 = new LoanSevenDays();
        a1.handle("tom","12345");

        System.out.println("==========================");

        Account a2 = new LoanOneMonth();
        a2.handle("tom","123456");
    }
}
