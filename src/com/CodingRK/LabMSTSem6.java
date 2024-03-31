package com.CodingRK;

class Deposit {
    protected double principal;
    protected int timePeriod;
    protected int interestRate;
    public Deposit(double principal, int timePeriod, int interestRate) {
        this.principal = principal;
        this.timePeriod = timePeriod;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return (principal * timePeriod * interestRate) / 100;
    }
}

class FixedDeposit extends Deposit {
    private int lockPeriod;

    public FixedDeposit(double principal, int timePeriod, int interestRate, int lockPeriod) {
        super(principal, timePeriod, interestRate);
        this.lockPeriod = lockPeriod;
    }

    @Override
    public double calculateInterest() {
        if (lockPeriod >= 5) {
            return super.calculateInterest() + (super.calculateInterest() * 0.5);
        } else {
            return super.calculateInterest();
        }
    }
}

class RecurringDeposit extends Deposit {
    private int monthlyInstallment;

    public RecurringDeposit(double principal, int timePeriod, int interestRate, int monthlyInstallment) {
        super(principal, timePeriod, interestRate);
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public double calculateInterest() {
        if (monthlyInstallment >= 5000) {
            return super.calculateInterest() + (super.calculateInterest() * 0.3);
        } else {
            return super.calculateInterest();
        }
    }
}

public class LabMSTSem6 {
    public static void main(String[] args) {
         FixedDeposit fd = new FixedDeposit(10000, 3, 8, 6);
         RecurringDeposit rd = new RecurringDeposit(5000, 2, 7, 6000);
         System.out.println("Interest for Fixed Deposit: " + fd.calculateInterest());
         System.out.println("Interest for Recurring Deposit: " + rd.calculateInterest());
    }
}

