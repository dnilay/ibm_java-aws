package com.ibm.service;

import java.util.List;

import com.ibm.model.Customer;
import com.ibm.repo.CustomerRepository;
import com.ibm.repo.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	{
		customerRepository=new CustomerRepositoryImpl();
	}

	@Override
	public Customer createCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.createCustomer(customer);
	}

	@Override
	public List<Customer> getAllCustomers() throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.getAllCustomers();
	}

	@Override
	public Customer getCustomerByCustomerId(int customerId) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByCustomerId(customerId);
	}

	@Override
	public Customer getCustomerByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByEmail(email);
	}

}
