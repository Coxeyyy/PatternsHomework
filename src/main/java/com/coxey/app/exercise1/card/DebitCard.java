package com.coxey.app.exercise1.card;

public class DebitCard implements Card {
    private double balance = 0;

    public DebitCard() {
        System.out.println("Дебетовая карта успешно создана!");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void increaseBalance(double value) {
        balance += value;
    }

    @Override
    public void decreaseBalance(double value) {
        if(balance < value) {
            throw new RuntimeException("Невозможно снять деньги, недостаточно средств");
        }
        balance -= value;
    }
}
