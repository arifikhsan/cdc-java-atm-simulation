package com.example.cdcjavaatmsimulationstagethree.entity;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "accounts")
public class AccountEntity extends BaseEntity {
    private String name;
    private String number;
    private String pin;
    private Integer balance;
}
