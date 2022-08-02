package com.example.cdcjavaatmsimulationstagethree.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity(name = "balance_inquiries")
public class BalanceInquiryEntity extends BaseTransactionEntity {
    private Integer balance;

    @ManyToOne
    private AccountEntity account;
}
