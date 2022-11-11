package com.example.FoodManagement.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public SuperClass() {}

	public SuperClass(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "SuperClass [id=" + id + "]\n";
	}

}
