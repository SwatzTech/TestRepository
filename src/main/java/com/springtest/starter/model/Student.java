package com.springtest.starter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	private String name;
	@Id
	private String id;
	private int grade;
	
	public Student() {
		
	}
	public Student(String name, String id, int grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
