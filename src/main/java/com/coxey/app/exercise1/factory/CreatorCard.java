package com.coxey.app.exercise1.factory;

import com.coxey.app.exercise1.card.Card;

public abstract class CreatorCard {
    public void checkBalanceCard() {
        Card card = createCard();
        System.out.println("Баланс карты: " + card.getBalance() + " руб.");
    }
    public abstract Card createCard();
}
