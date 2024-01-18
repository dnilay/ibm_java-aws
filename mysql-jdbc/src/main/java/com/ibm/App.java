package com.ibm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.ibm.model.Employee;
import com.ibm.service.EmployeeService;
import com.ibm.service.EmployeeServiceImpl;

public class App {
	private  EmployeeService employeeService;
	{
		employeeService=new EmployeeServiceImpl();
	}
	public static void main(String[] args) {
		try {

			List<Employee> employees=new App().employeeService.getAllEmployees();
			
			for(Employee e:employees)
			{
				System.out.println(e);
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
