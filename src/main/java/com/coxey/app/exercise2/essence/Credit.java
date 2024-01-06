package com.coxey.app.exercise2.dto;

public class CreditDTO {
    private int creditAmount;
    private double interestRate;
    private int creditPeriod;
    private double monthlyPayment;

    public CreditDTO(int creditAmount, double interestRate, int creditPeriod, double monthlyPayment) {
        this.creditAmount = creditAmount;
        this.interestRate = interestRate;
        this.creditPeriod = creditPeriod;
        this.monthlyPayment = monthlyPayment;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getCreditPeriod() {
        return creditPeriod;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
