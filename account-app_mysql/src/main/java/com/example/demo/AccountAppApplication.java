package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@AllArgsConstructor
@SpringBootApplication
@EnableDiscoveryClient
public class AccountAppApplication {
	// private final AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccountAppApplication.class, args);
	}
	/*
	 * @PostConstruct public void init() throws Exception { // TODO Auto-generated
	 * method stub
	 * 
	 * List<Account> result = Stream .of(new Account(UUID.randomUUID().toString(),
	 * "Sachin", "Mumbai", "sachin@email.com"), new
	 * Account(UUID.randomUUID().toString(), "Rahul", "Banglore",
	 * "rahul@email.com"), new Account(UUID.randomUUID().toString(), "Sourav",
	 * "Kolkata", "sourav@email.com")) .collect(Collectors.toList()); for (Account a
	 * : result) { accountRepository.createAccount(a); }
	 */
}
