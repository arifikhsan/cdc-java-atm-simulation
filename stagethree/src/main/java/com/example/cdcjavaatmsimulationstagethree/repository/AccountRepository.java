package com.example.cdcjavaatmsimulationstagethree.repository;

import com.example.cdcjavaatmsimulationstagethree.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, UUID> { }
