package com.ibm;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

import com.ibm.model.Employee;
import com.ibm.service.EmployeeService;
import com.ibm.service.EmployeeServiceImpl;

public class App {
	private EmployeeService employeeService;
	{
		employeeService = new EmployeeServiceImpl();
	}
	private static Scanner scanner = new Scanner(in);

	public static void main(String[] args) {
		Employee employee = new Employee();
		try {

			out.print("enter first name: ");
			employee.setFirstName(scanner.next());
			out.print("enter last name: ");
			employee.setLastName(scanner.next());
			out.print("enter email: ");
			employee.setEmail(scanner.next());
			System.out.println(new App().employeeService.createEmployee(employee));
			List<Employee> employees = new App().employeeService.getAllEmployees();

			for (Employee e : employees) {
				out.println(e);
			}
		}

		catch (Exception e2) {

			// TODO: handle exception
			e2.printStackTrace();
		}

	}
}
