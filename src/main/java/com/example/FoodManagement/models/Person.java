package com.example.FoodManagement.models;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends SuperClass{
	
	private String name;
	private String mobile;
	private String email;
	
	public Person(int id, String name, String mobile, String email) {
		super(id);
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", mobile=" + mobile + ", email=" + email + "]\n";
	}
	
	

}
