package com.example.FoodManagement.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Employee extends Person{

	@OneToOne
	private Menu menu;

	public Employee(int id, String name, String mobile, String email, Menu menu) {
		super(id, name, mobile, email);
		this.menu = menu;
	}

	public Employee(){}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [menu=" + menu + "]\n";
	}

}
