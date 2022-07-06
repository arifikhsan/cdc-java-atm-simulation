package org.example.repository;

import org.example.model.AccountModel;
import org.example.data.CardData;

import java.util.List;

public class CardRepository {
    private List<AccountModel> cards = CardData.getAllCards();

    public List<AccountModel> getCards() {
        return cards;
    }

    public void setCards(List<AccountModel> cards) {
        this.cards = cards;
    }

    public AccountModel getCardByNumber(String cardNumber) {
        return cards.stream()
                .filter(card -> card.getNumber().equals(cardNumber))
                .findFirst()
                .orElse(null);
    }

    public boolean isExistByCardNumber(String cardNumber) {
        return cards.stream().anyMatch(card -> card.getNumber().equals(cardNumber));
    }

    public boolean isExistByCardNumberAndPin(String cardNumber, String pin) {
        return cards.stream().anyMatch(card -> card.getNumber().equals(cardNumber) && card.getPin().equals(pin));
    }
}
