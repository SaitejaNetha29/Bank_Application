package com.dailycodebuffer.Springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.Springboot.project.entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer>{


	public Bank findBankByBankName(String bankName);

}
