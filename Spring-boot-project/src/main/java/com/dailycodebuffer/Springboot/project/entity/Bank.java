package com.dailycodebuffer.Springboot.project.entity;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankRequisitionNumber;
	private String bankName;
	private String bankManagerName;
	private String bankAddress;
	public Bank(int bankRequisitionNumber, String bankName, String bankManagerName, String bankAddress) {
		super();
		this.bankRequisitionNumber = bankRequisitionNumber;
		this.bankName = bankName;
		this.bankManagerName = bankManagerName;
		this.bankAddress = bankAddress;
	}
	Bank(){}
	public int getBankRequisitionNumber() {
		return bankRequisitionNumber;
	}
	public void setBankRequisitionNumber(int bankRequisitionNumber) {
		this.bankRequisitionNumber = bankRequisitionNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankManagerName() {
		return bankManagerName;
	}
	public void setBankManagerName(String bankManagerName) {
		this.bankManagerName = bankManagerName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	
}
