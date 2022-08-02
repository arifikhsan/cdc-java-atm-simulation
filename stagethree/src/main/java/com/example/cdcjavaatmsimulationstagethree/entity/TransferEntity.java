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
@Entity(name = "transfers")
public class TransferEntity extends BaseTransactionEntity {

    @ManyToOne
    private AccountEntity fromAccountEntity;

    @ManyToOne
    private AccountEntity toAccountEntity;

    private Integer amount;
    private LocalDateTime dateTime;
    private Integer reference;
}
