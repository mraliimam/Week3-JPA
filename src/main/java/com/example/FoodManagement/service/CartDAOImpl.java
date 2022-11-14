package com.example.FoodManagement.service;

import com.example.FoodManagement.models.Cart;
import com.example.FoodManagement.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartDAOImpl extends GenericDAOImpl<Cart> {

	@Autowired
	private CartRepository repo;

	@Override
	public Cart update(Cart c){
		Cart c1 = repo.findById(c.getId()).orElse(null);

		c1.setId(c1.getId());
		c1.setFood(c.getFood());
		c1.setTotal_price();

		return repo.save(c1);
	}
}
