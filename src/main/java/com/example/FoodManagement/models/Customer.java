package com.example.FoodManagement.models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Customer extends Person{

	@OneToOne
	private Cart cart;

	public Customer(int id, String name, String mobile, String email, Cart cart) {
		super(id, name, mobile, email);
		this.cart = cart;
	}

	public Customer() {
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return ""+super.toString()+"Customer [cart=" + cart + "]\n";
	}
	
	
}
