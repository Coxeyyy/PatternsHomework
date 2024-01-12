package com.coxey.app.exercise1.card;

import com.coxey.app.exercise1.exception.NotEnoughMoneyException;

public class CreditCard implements Card {
    private double balance = 10_000;

    public CreditCard() {
        System.out.println("Кредитная карта успешно создана!");
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
            throw new NotEnoughMoneyException("Невозможно снять деньги, недостаточно средств");
        }
        balance -= value;
    }
}
