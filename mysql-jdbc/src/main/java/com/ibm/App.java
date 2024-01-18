package com.ibm;

import static java.lang.System.in;
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
	//	Employee employee = new Employee();
		try {
BufferedReader br=new BufferedReader(new InputStreamReader(in));
			/*
			 * out.print("enter first name: "); employee.setFirstName(scanner.next());
			 * out.print("enter last name: "); employee.setLastName(scanner.next());
			 * out.print("enter email: "); employee.setEmail(scanner.next());
			 * System.out.println(new App().employeeService.createEmployee(employee));
			 * List<Employee> employees = new App().employeeService.getAllEmployees();
			 * 
			 * for (Employee e : employees) { out.println(e); }
			 */
			out.print("enter employee id: ");
			Employee employee2 = new App().employeeService.findEmployeeById(scanner.nextInt());
			if (employee2 == null) {
				out.println("Invalid ID...");
			} else {
				out.print("enter new first name: ");
				String fName = br.readLine();
				out.print("enter new last name: ");
				String lName = br.readLine();
				out.print("enter email: ");
				String email = br.readLine();
				if (fName.length() > 0) {
					employee2.setFirstName(fName);
				}
				if (lName.length() > 0) {
					employee2.setLastName(lName);
				}
				if (email.length() > 0) {
					employee2.setEmail(email);
				}
			}
			new App().employeeService.updateEmployeeById(employee2);
		}

		catch (Exception e2) {

			// TODO: handle exception
			e2.printStackTrace();
		}

	}
}
