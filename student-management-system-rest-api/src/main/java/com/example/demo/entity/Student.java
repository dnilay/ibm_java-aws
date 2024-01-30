package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private String studentId;
	private String name;
	private String stream;

	public Student() {
		super();
	}

	public Student(String studentId, String name, String stream) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.stream = stream;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", stream=" + stream + "]";
	}

}
