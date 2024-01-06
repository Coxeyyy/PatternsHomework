package com.coxey.app.exercise2.dto;

public class ClientDTO {
    private String fullName;
    private int age;
    private String phoneNumber;
    private double incomePerMonth;
    private boolean creditHistory;

    public ClientDTO(String fullName, int age, String phoneNumber, double incomePerMonth, boolean creditHistory) {
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
