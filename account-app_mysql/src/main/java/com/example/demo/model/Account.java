package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "account_table")
public class Account {
	@Id

	@jakarta.validation.constraints.NotBlank(message = "account number can not be blank")
	@Column(name = "account_number")
	private String accountNumber;
	@jakarta.validation.constraints.NotBlank(message = "account holder name can not blank")
	@Length(min = 5, max = 16, message = "account holder name is wrong")
	@Column(name = "account_holder_name")

	private String accountHolderName;
	@Column(name = "account_holder_address")
	private String accountHolderAddress;
	@Column(name = "account_holder_email", unique = true)
	@jakarta.validation.constraints.Email(message = "invalid email",regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
	
	private String email;

	/*
	 * @Min(value = 1000,message = "minium amount required")
	 * 
	 * @Max(value = 10000,message = "maximum value reached") private double amount;
	 */
	public Account(String accountHolderName, String accountHolderAddress, String email) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.email = email;
	}

}
