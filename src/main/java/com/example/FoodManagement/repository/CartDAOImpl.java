package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Cart;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartDAOImpl extends GenericDAOImpl<Cart> {
	List<Cart> cart;

	public CartDAOImpl() {
		cart = new ArrayList<>();
	}
}
