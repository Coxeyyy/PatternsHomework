package com.coxey.app.exercise1.factory;

import com.coxey.app.exercise1.card.Card;
import com.coxey.app.exercise1.card.DebitCard;

public class CreatorDebitCard extends CreatorCard {
    @Override
    public Card createCard() {
        return new DebitCard();
    }
}
