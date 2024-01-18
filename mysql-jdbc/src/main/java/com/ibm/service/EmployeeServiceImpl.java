package com.ibm.service;

import java.sql.SQLException;
import java.util.List;

import com.ibm.model.Employee;
import com.ibm.repository.EmployeeRepository;
import com.ibm.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	{
		try {
			employeeRepository = new EmployeeRepositoryImpl();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return employeeRepository.getAllEmployees();
	}

}
