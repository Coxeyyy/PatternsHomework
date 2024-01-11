package com.coxey.app.exercise2.essence;

public class Client {
    private final String fullName;
    private final int age;
    private final String phoneNumber;
    private final double incomePerMonth;
    private final boolean creditHistory;

    public Client(String fullName, int age, String phoneNumber, double incomePerMonth, boolean creditHistory) {
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.incomePerMonth = incomePerMonth;
        this.creditHistory = creditHistory;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getIncomePerMonth() {
        return incomePerMonth;
    }

    public boolean isCreditHistory() {
        return creditHistory;
    }
}
