package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Student;

@Controller
public class HomeController {

	private final RestTemplate restTemplate;

	public HomeController(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@GetMapping("/")
	public String showHome() {
		return "index";
	}

	@GetMapping("/show-form")
	public String showForm() {
		return "show-form";
	}

	@GetMapping("/display")
	public String displayData()

	{
		ResponseEntity<Student[]> responseEntity=restTemplate.getForEntity("http://localhost:9090/students",Student[].class );
		Student[] students=responseEntity.getBody();
		for(Student s:students)
			
		{
			System.out.println(s);
		}
		return "display-form";
	}
}
