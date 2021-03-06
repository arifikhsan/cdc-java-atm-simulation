package org.example.model;

import java.time.LocalDateTime;

public class WithdrawModel {
    private LocalDateTime datetime;
    private Integer amount;
    private Integer balance;
    private AccountModel card;

    public WithdrawModel(LocalDateTime datetime, Integer amount, Integer balance, AccountModel card) {
        this.datetime = datetime;
        this.amount = amount;
        this.balance = balance;
        this.card = card;
    }

    public WithdrawModel() {
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
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

    public AccountModel getCard() {
        return card;
    }

    public void setCard(AccountModel card) {
        this.card = card;
    }
}
