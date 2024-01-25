package com.example.demo.service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.example.demo.model.Account;

public interface AccountService {
	Account createAccount(Account account);

	List<Account> getAllAccounts();
	Account getAccountByaccountNumber(String accountNumber) throws AccountNotFoundException;
}