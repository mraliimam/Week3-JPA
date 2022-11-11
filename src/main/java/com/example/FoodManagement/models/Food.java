package com.example.FoodManagement.models;

import javax.persistence.Entity;

@Entity
public class Food extends SuperClass{
	
	private String name;
	private String flavor;
	private String size;
	private int price;

	public Food(){}
	public Food(int id, String name, String flavor, String size, int price) {
		super(id);
		this.name = name;
		this.flavor = flavor;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [id = "+ super.getId() +", name=" + name + ", flavor=" + flavor + ", size=" + size + ", price=" + price + "]\n";
	}
}
