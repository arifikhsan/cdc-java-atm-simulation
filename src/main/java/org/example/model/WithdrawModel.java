package org.example.model;

import java.time.LocalDate;

public class WithdrawModel {
    private LocalDate date;
    private Integer amount;
    private Integer balance;
    private CardModel card;

    public WithdrawModel(LocalDate date, Integer amount, Integer balance, CardModel card) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
        this.card = card;
    }

    public WithdrawModel() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }
}
