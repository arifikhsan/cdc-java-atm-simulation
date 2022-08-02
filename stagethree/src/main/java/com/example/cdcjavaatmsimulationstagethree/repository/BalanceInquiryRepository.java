package com.example.cdcjavaatmsimulationstagethree.repository;

import com.example.cdcjavaatmsimulationstagethree.entity.BalanceInquiryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BalanceInquiryRepository extends JpaRepository<BalanceInquiryEntity, UUID> { }
