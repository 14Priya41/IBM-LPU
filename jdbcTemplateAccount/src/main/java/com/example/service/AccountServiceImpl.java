package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Account;
import com.example.dao.AccountDao;
@Service

public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return accountDao.createAccount(account);
	}

	
	@Override
	public void deleteAccount(String accountNumber) {
		// TODO Auto-generated method stub
		accountDao.deleteAccount(accountNumber);
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		return accountDao.getAllAccountDetails();
	}

	@Override
	public Account findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return accountDao.findByAccountNumber(accountNumber);
	}


	@Override
	public void updateAccount(String accountNumber, String accountType, int initialBalance) {
		// TODO Auto-generated method stub
		accountDao.updateAccount(accountNumber, accountType, initialBalance);
		
	}
}
