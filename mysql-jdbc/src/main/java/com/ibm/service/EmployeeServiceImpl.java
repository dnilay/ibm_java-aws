package com.ibm.service;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

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

	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		employee.setEmployeeId(generateId());
		return employeeRepository.createEmployee(employee);
	}
	
	private Integer generateId()
	{
		UUID idOne = UUID.randomUUID();
		String str = "" + idOne;
		int uid = str.hashCode();
	
		String filterStr = "" + uid;
		str = filterStr.replaceAll("-", "");
		System.out.println(str);
		int a=Integer.parseInt(str);
		return a;
	}

	@Override
	public Employee updateEmployeeById(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		return employeeRepository.updateEmployeeById(employee);
	}

	@Override
	public Employee findEmployeeById(int employeeId) throws SQLException {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeById(employeeId);
	}

	@Override
	public void deleteEmployeeById(int employeeId) throws SQLException {
		// TODO Auto-generated method stub
		employeeRepository.deleteEmployeeById(employeeId);
	} 

}
