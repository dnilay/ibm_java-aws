
package com.example.demo.repo;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Account;

import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component(value = "accountRepository")
@EnableTransactionManagement
public class AccountRepositoryImpl implements AccountRepository {

	private final SessionFactory sessionFactory;

	@Override

	@Transactional
	public Account createAccount(Account account) { // TODO
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(account);
		session.getTransaction().commit();
		return account;
	}

	@Override
	public List<Account> getAllAccounts() { // TODO Auto-generated
		Session session = sessionFactory.openSession();
		TypedQuery<Account> query = session.createQuery("FROM Account A", Account.class);
		return query.getResultList();
	}

	@Override
	public Account getAccountByaccountNumber(String accountNumber) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Account account=session.get(Account.class, accountNumber);
		if(account==null)
		{
			throw new AccountNotFoundException("account with "+accountNumber+" not found");
		}
		return account;
	}

}
