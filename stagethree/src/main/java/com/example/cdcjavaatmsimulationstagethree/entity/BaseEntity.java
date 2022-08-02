package com.example.cdcjavaatmsimulationstagethree.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;


@Getter
@Setter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {
    @Id
    @Type(type="pg-uuid")
    @GeneratedValue(generator = "uuid")
    @Column(unique = true, nullable = false)
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;
}
