package com.dailycodebuffer.Springboot.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.project.entity.Bank;
import com.dailycodebuffer.Springboot.project.service.BankService;

@RestController
public class BankController {
	
	
	@Autowired
	private BankService bankService;
	
	@PostMapping("/saveBank")
	public Bank createBank(@RequestBody Bank bank) {
		return bankService.save(bank);
	}
	
	@GetMapping("/getBanks")
	public List<Bank> getBanksList() {
		return bankService.getBanks();
	}
	
	@GetMapping("/getBankById/{bankId}")
	public Bank getBankById(@PathVariable Integer bankId) {
		return bankService.getBankById(bankId);
	}
	
	@DeleteMapping("/delete/{bankId}")
	public String deleteBankById(@PathVariable Integer bankId) {
		bankService.deleteBankById(bankId);
		return "Bank details deleted successfully";
	}
	
	@PutMapping("/updateBank/{bankId}")
	public Bank updateBankDetailsById(@RequestBody Bank bank, @PathVariable Integer bankId) {
		return bankService.updateBankDetailsById(bank,bankId);
	}
	
	@GetMapping("/getBank/{bankName}")
	public Bank fetchBankByBankName(@PathVariable String bankName) {
		return bankService.fetchBankByBankName(bankName);
	}
}
