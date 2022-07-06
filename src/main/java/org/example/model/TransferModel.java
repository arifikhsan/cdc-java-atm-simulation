package org.example.model;

import java.time.LocalDateTime;

public class TransferModel {
    private AccountModel fromCard;
    private AccountModel toCard;
    private Integer amount;
    private LocalDateTime dateTime;
    private Integer reference;

    public TransferModel() {
    }

    public TransferModel(AccountModel fromCard, AccountModel toCard, Integer amount, LocalDateTime dateTime, Integer reference) {
        this.fromCard = fromCard;
        this.toCard = toCard;
        this.amount = amount;
        this.dateTime = dateTime;
        this.reference = reference;
    }

    public AccountModel getFromCard() {
        return fromCard;
    }

    public void setFromCard(AccountModel fromCard) {
        this.fromCard = fromCard;
    }

    public AccountModel getToCard() {
        return toCard;
    }

    public void setToCard(AccountModel toCard) {
        this.toCard = toCard;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getReference() {
        return reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }
}
