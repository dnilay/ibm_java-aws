package com.example.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class EmployeeController {
	private final EmployeeService employeeService;

	@GetMapping
	public String home(Model theModel) {
		theModel.addAttribute("theDate", new Date());
		return "index";
	}
	@GetMapping("/employees")
	public String getAllEmployees(Model theModel)
	{
		theModel.addAttribute("employees",employeeService.getEmployees());
		return "list-employee";
	}

}
