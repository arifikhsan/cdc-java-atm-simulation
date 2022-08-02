package com.example.cdcjavaatmsimulationstagethree.repository;

import com.example.cdcjavaatmsimulationstagethree.entity.TransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransferRepository extends JpaRepository<TransferEntity, UUID> { }
