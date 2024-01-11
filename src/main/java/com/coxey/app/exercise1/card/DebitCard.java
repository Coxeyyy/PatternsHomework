package com.coxey.app.exercise1.card;

public class DebitCard implements Card {
    public DebitCard() {
        System.out.println("Дебетовая карта успешно создана!");
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
