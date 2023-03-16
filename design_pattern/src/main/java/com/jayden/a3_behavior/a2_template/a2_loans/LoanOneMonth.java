package com.jayden.a3_behavior.a2_template.a2_loans;

/**
 * 借款一个月
 **/
public class LoanOneMonth extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期30天,利率为10%!");
    }
}