package com.coxey.app.exercise1.factory;

import com.coxey.app.exercise1.card.Card;
import com.coxey.app.exercise1.card.CreditCard;

public class CreatorCreditCard extends CreatorCard {
    @Override
    public Card createCard() {
        return new CreditCard();
    }
}
