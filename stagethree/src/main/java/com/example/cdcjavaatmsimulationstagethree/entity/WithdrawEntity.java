package com.example.cdcjavaatmsimulationstagethree.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "withdraws")
public class WithdrawEntity extends BaseTransactionEntity {
    private Integer amount;
    private Integer balance;
    private LocalDateTime datetime;

    @ManyToOne
    private AccountEntity account;
}
