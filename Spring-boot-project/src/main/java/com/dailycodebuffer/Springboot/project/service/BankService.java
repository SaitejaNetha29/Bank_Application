package com.dailycodebuffer.Springboot.project.service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.project.entity.Bank;
import com.dailycodebuffer.Springboot.project.repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankRepository;

	public Bank save(Bank bank) {
		return bankRepository.save(bank);
	}
	
	public List<Bank> getBanks() {
		return bankRepository.findAll();
	}

	public Bank getBankById(Integer bankId) {
		return bankRepository.findById(bankId).get();
	}

	public void deleteBankById(Integer bankId) {
		Optional<Bank> bdb = bankRepository.findById(bankId);
		if(bdb.isPresent()) {
			bankRepository.deleteById(bankId);
		}
	}

	public Bank updateBankDetailsById(Bank bank, Integer bankId) {
		Bank bdb2 = bankRepository.findById(bankId).get();
		if(Objects.nonNull(bank.getBankName()) && !"".equalsIgnoreCase(bank.getBankName())) {
			bdb2.setBankName(bank.getBankName());
		}
		if(Objects.nonNull(bank.getBankManagerName()) && !"".equalsIgnoreCase(bank.getBankManagerName())) {
			bdb2.setBankManagerName(bank.getBankManagerName());
		}
		if(Objects.nonNull(bank.getBankAddress()) && !"".equalsIgnoreCase(bank.getBankAddress())) {
			bdb2.setBankAddress(bank.getBankAddress());
		}
		return bankRepository.save(bdb2);
	}


	public Bank fetchBankByBankName(String bankName) {
		return bankRepository.findBankByBankName(bankName);
	}

}
