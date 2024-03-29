package com.ibm.repo;

import java.util.List;

import javax.persistence.TypedQuery;

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
		System.out.println(customer);
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.persist(customer);
		session.getTransaction().commit();
		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws Exception {
		Session session=sessionFactory.openSession();
		TypedQuery<Customer> query=session.createQuery("FROM Customer C",Customer.class);
		
		return query.getResultList();
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) throws Exception {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Customer customer=session.find(Customer.class, customerId);
		return customer;
	}

	@Override
	public Customer getCustomerByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		TypedQuery<Customer> query=session.createQuery("FROM Customer C where C.customerEmail=:e",Customer.class);
		query.setParameter("e", email);
		if(query.getResultList().size()>0)
		{
			Customer customer=query.getResultList().get(0);
			return customer;
		}
		else
		{
			return null;
		}
		
	}

}
