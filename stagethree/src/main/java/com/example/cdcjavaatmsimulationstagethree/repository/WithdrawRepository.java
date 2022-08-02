package com.example.cdcjavaatmsimulationstagethree.repository;

import com.example.cdcjavaatmsimulationstagethree.entity.WithdrawEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WithdrawRepository extends JpaRepository<WithdrawEntity, UUID> { }
