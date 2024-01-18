package com.ibm.repository;

import java.sql.SQLException;
import java.util.List;

import com.ibm.model.Employee;

public interface EmployeeRepository {
	
	List<Employee> getAllEmployees()throws SQLException;
	
	Employee createEmployee(Employee employee) throws SQLException;

}
