package com.ibm.repo;

import com.ibm.model.Customer;

public interface CustomerRepository {
	
	Customer createCustomer(Customer customer) throws Exception;

}
