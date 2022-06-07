package org.example.repository;

import org.example.model.CardModel;

import java.util.List;

public class CardRepository {
    private List<CardModel> cards;
    private CardModel loggedInCard;

    public CardRepository(List<CardModel> cards, CardModel loggedInCard) {
        this.cards = cards;
        this.loggedInCard = loggedInCard;
    }

    public List<CardModel> getCards() {
        return cards;
    }

    public void setCards(List<CardModel> cards) {
        this.cards = cards;
    }

    public CardModel getLoggedInCard() {
        return loggedInCard;
    }

    public void setLoggedInCard(CardModel loggedInCard) {
        this.loggedInCard = loggedInCard;
    }

    public CardModel getCardByNumber(String cardNumber) {
        return cards.stream()
                .filter(card -> card.getNumber().equals(cardNumber))
                .findFirst()
                .orElse(null);
    }

    public boolean existCardByNumber(String cardNumber) {
        return cards.stream().anyMatch(card -> card.getNumber().equals(cardNumber));
    }
}
