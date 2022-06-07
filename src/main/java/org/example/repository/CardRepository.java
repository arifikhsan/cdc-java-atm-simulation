package org.example.repository;

import org.example.model.CardModel;
import org.example.seeder.CardSeeder;

import java.util.List;

public class CardRepository {
    private List<CardModel> cards = CardSeeder.seed();

    public List<CardModel> getCards() {
        return cards;
    }

    public void setCards(List<CardModel> cards) {
        this.cards = cards;
    }

    public CardModel getCardByNumber(String cardNumber) {
        return cards.stream()
                .filter(card -> card.getNumber().equals(cardNumber))
                .findFirst()
                .orElse(null);
    }

    public boolean isExistByNumber(String cardNumber) {
        return cards.stream().anyMatch(card -> card.getNumber().equals(cardNumber));
    }

    public boolean isExistByNumberAndPin(String cardNumber, String pin) {
        return cards.stream().anyMatch(card -> card.getNumber().equals(cardNumber) && card.getPin().equals(pin));
    }
}
