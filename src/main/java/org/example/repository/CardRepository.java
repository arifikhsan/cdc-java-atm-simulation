package org.example.repository;

import org.example.model.AccountModel;
import org.example.data.AccountData;

import java.util.List;

public class CardRepository {
    private List<AccountModel> accounts = AccountData.getAllAccounts();

    public List<AccountModel> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountModel> accounts) {
        this.accounts = accounts;
    }

    public AccountModel getCardByNumber(String cardNumber) {
        return accounts.stream()
                .filter(card -> card.getNumber().equals(cardNumber))
                .findFirst()
                .orElse(null);
    }

    public boolean isExistByCardNumber(String cardNumber) {
        return accounts.stream().anyMatch(card -> card.getNumber().equals(cardNumber));
    }

    public boolean isExistByCardNumberAndPin(String cardNumber, String pin) {
        return accounts.stream().anyMatch(card -> card.getNumber().equals(cardNumber) && card.getPin().equals(pin));
    }
}
