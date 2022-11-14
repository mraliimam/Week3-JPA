package com.example.FoodManagement.service;

import com.example.FoodManagement.models.Customer;
import com.example.FoodManagement.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDAOImpl extends GenericDAOImpl<Customer>{

	@Autowired
	private CustomerRepository repo;

	@Override
	public Customer update(Customer c){
		Customer c1 = repo.findById(c.getId()).orElse(null);

		c1.setId(c.getId());
		c1.setName(c.getName());
		c1.setMobile(c.getMobile());
		c1.setEmail(c.getEmail());
		c1.setCart(c.getCart());

		return repo.save(c1);
	}

}
