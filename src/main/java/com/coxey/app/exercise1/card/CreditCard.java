package com.coxey.app.exercise1.card;

public class CreditCard implements Card {
    public CreditCard() {
        System.out.println("Кредитная карта успешно создана!");
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
