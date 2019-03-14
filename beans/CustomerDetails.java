package com.cg.bank.beans;

public class CustomerDetails {
private String  firstName,lastName,emailId,aadharNumber,address,panCardNo;
private int password,balance,accountNumber;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(String aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPanCardNo() {
	return panCardNo;
}
public void setPanCardNo(String panCardNo) {
	this.panCardNo = panCardNo;
}
public int getPassword() {
	return password;
}
public void setPassword(int password) {
	this.password = password;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
private long mobileNo;

	
}
