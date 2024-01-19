package com.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import com.ibm.model.Customer;
import com.ibm.repo.CustomerRepository;
import com.ibm.repo.CustomerRepositoryImpl;
import com.ibm.service.CustomerService;
import com.ibm.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	
	private static CustomerService customerService;
	
	static
	{
		customerService=new CustomerServiceImpl();
	}
	public static void main(String[] args)throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		Customer customer=new Customer();
		
		
		try {
			
			/*
			 * System.out.print("Enter customer Name: ");
			 * customer.setCustomerName(bufferedReader.readLine());
			 * System.out.println("enter customer address: ");
			 * customer.setCustomerAddress(bufferedReader.readLine());
			 * System.out.println("One Customer created: "+customerService.createCustomer(
			 * customer));
			 */
			/*
			 * for(Customer c:customerService.getAllCustomers()) { System.out.println(c); }
			 */
			System.out.println("enter customer id: ");
			customer=customerService.getCustomerByCustomerId(Integer.parseInt(bufferedReader.readLine()));
			if(customer==null)
			{
				System.out.println("no such customer available..");
			}
			else
			{
				System.out.println(customer);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
