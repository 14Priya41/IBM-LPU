package com.example.service;

import java.util.List;

import com.example.bean.Account;

public interface AccountService {

	public Account createAccount(Account account);
	public void updateAccount(String accountNumber,String accountType,int initialBalance);
	public void deleteAccount(String accountNumber);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
}
