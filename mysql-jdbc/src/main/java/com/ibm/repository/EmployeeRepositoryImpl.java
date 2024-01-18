package com.ibm.repository;

import java.sql.Connection;
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

}
