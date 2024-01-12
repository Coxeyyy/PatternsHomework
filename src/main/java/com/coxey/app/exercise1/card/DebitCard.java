package com.coxey.app.exercise1.card;

import com.coxey.app.exercise1.exception.NotEnoughMoneyException;

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
            throw new NotEnoughMoneyException("Невозможно снять деньги, недостаточно средств");
        }
        balance -= value;
    }
}
