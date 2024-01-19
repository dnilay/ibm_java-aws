package com.ibm.service;

import java.util.List;

import com.ibm.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer) throws Exception;
	List<Customer> getAllCustomers() throws Exception;
}
