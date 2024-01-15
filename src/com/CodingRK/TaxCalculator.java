package com.CodingRK;

public class TaxCalculator {

    public static int taxCalculator(int income) {
        int tax = 0;
        if (500000 < income && income <= 1000000) {
            tax = ((income - 500000) / 100) * 20;
        } else if (income > 1000000) {
            tax = ((income - 1000000) / 100) * 30 + ((income - 500000) / 100) * 20;
            ;
        }
        return tax;
    }

    public static void main(String[] args) {
        System.out.println(taxCalculator(1200000));
    }
}
