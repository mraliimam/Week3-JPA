package com.example.FoodManagement.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class Cart extends SuperClass{

	@OneToMany
	private List<Food> food;
	private Date date;
	private int total_price;
	

	public Cart(int id, List<Food> food) {
		super(id);
		this.food = food;
		this.date = new Date();
		for(Food f: food) {
			this.total_price += f.getPrice();
		}
	}
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

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
//	public void setDate(Date date) {
//		this.date = date;
//	}

	
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price() {
		for(Food f: food) {
			this.total_price += f.getPrice();
		}
		this.date = new Date();
	}

	@Override
	public String toString() {
		return "Cart [id=" + super.getId() +  ", date=" + date + ", total_price=" + total_price + "]\n" + food;
	}
	
	

}
