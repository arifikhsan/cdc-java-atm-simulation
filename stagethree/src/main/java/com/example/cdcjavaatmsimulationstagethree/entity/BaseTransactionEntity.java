package com.example.cdcjavaatmsimulationstagethree.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class BaseTransactionEntity extends BaseEntity {
    private AccountEntity actor;
    private LocalDateTime happenedAt;
}
