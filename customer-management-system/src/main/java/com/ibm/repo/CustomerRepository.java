package com.ibm.repo;

import java.util.List;

import com.ibm.model.Customer;

public interface CustomerRepository {
	
	Customer createCustomer(Customer customer) throws Exception;
	List<Customer> getAllCustomers() throws Exception;
	Customer getCustomerByCustomerId(int customerId) throws Exception;
	Customer getCustomerByEmail(String email) throws Exception;
	

}
