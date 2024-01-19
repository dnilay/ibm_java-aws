package com.ibm.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ibm.factory.MySessionfactory;
import com.ibm.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	private SessionFactory sessionFactory;
	
	{
		sessionFactory=MySessionfactory.getSessionFactory();
	}

	@Override
	public Customer createCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(customer);
		session.getTransaction().commit();
		return customer;
	}

}
