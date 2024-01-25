package com.example.demo.repo;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.stereotype.Component;

import com.example.demo.model.Account;
@Component(value = "accountRepository")
public interface AccountRepository {
	
	Account createAccount(Account account);
	
	List<Account> getAllAccounts();
	
	Account getAccountByaccountNumber(String accountNumber) throws AccountNotFoundException;

}
