package com.example.FoodManagement.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Menu extends SuperClass{

	@OneToMany
	private List<Food> food;
	private Date date;
	
	public Menu(int id, List<Food> food) {
		super(id);
		this.food = food;
		this.date = new Date();
	}
	public Menu(){}
	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
		this.date = new Date();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = new Date();
	}

	@Override
	public String toString() {
		return "Menu [id = "+ super.getId() +", date=" + date + "]\n"+food;
	}
}
