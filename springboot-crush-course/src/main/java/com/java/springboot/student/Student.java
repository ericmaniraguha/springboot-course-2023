package com.java.springboot.student;

import java.time.LocalDate;

public class Student {
	
	private Long id;
	private String name ;
	private String email;
	private LocalDate dob;
	private Integer age;
	
	//constructor without any variable 
	public Student() {
		super();
	}
	//constructor without id variable
	/**
	 * @param name
	 * @param email
	 * @param dob
	 * @param age
	 */
	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	//constructor with all variables 
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param dob
	 * @param age
	 */
	public Student(Long id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
		//setters and getters methods
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	// toString
	@Override
	public String toString() {
		return "Student [Id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}
	
	
	
}
