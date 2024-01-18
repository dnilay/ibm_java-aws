package com.ibm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ibm.factory.MyFactory;
import com.ibm.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	private Connection connection = null;
	private List<Employee> list = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	private PreparedStatement preparedStatement=null;

	{
		try {
			connection = MyFactory.getMyConnection();
			list = new ArrayList<Employee>();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {

		statement=connection.createStatement();
		resultSet=statement.executeQuery("select * from employees");
		while(resultSet.next())
		{
			list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)));
			
			
		}
		return list;
	}

	@Override
	public Employee createEmployee(Employee employee) throws SQLException {
		// TODO Auto-generated method stub
		preparedStatement=connection.prepareStatement("insert into employees(employee_id,first_name,last_name,email) values(?,?,?,?)");
		preparedStatement.setInt(1, employee.getEmployeeId());
		preparedStatement.setString(2, employee.getFirstName());
		preparedStatement.setString(3, employee.getLastName());
		preparedStatement.setString(4, employee.getEmail());
		preparedStatement.executeUpdate();
		return employee;
	}

}
