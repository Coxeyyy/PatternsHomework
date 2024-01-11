package com.coxey.app.exercise1.factory;

import com.coxey.app.exercise1.card.Card;

public abstract class CreatorCard {
    private Card card = createCard();

    public void checkBalanceCard() {
        System.out.println("Баланс карты: " + card.getBalance() + " руб.");
    }

    public void increaseCardBalance(double value) {
        card.increaseBalance(value);
        System.out.println("Баланс карты пополнен на сумму: " + value + " руб.");
    }

    public void decreaseCardBalance(double value) {
        card.decreaseBalance(value);
        System.out.println("С карты было списано: " + value + " руб.");
    }

    public abstract Card createCard();
}
