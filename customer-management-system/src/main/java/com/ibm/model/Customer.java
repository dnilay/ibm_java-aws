package com.ibm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")

	private int customerId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_address")
	private String customerAddress;
	@Column(name = "customer_email")
	private String customerEmail;

	public Customer(String customerName, String customerAddress,String customerEmail) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerEmail=customerEmail;
	}

}
