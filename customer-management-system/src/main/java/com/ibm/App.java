package com.ibm;

import java.util.Random;

import com.ibm.model.Customer;
import com.ibm.repo.CustomerRepository;
import com.ibm.repo.CustomerRepositoryImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			CustomerRepository customerRepository = new CustomerRepositoryImpl();
			Customer customer = customerRepository.createCustomer(new Customer(new Random().nextInt(10000),"Mary", "Banglore"));

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
