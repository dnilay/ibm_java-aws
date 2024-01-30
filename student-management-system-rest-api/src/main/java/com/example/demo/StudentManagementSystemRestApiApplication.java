package com.example.demo;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemRestApiApplication implements CommandLineRunner{
	
	private final StudentRepository studentRepository;
	

	public StudentManagementSystemRestApiApplication(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemRestApiApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		studentRepository.save(new Student(UUID.randomUUID().toString(), "John", "CS"));
		studentRepository.save(new Student(UUID.randomUUID().toString(), "Mary", "CS"));
		studentRepository.save(new Student(UUID.randomUUID().toString(), "Susan", "IT"));
		
	}

}
