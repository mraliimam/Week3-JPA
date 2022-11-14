package com.example.FoodManagement.service;

import com.example.FoodManagement.models.Menu;
import com.example.FoodManagement.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MenuDAOImpl extends GenericDAOImpl<Menu>{

	@Autowired
	private MenuRepository repo;

	@Override
	public Menu update(Menu m){
		Menu m1 = repo.findById(m.getId()).orElse(null);

		m1.setId(m.getId());
		m1.setFood(m.getFood());
		m1.setDate(new Date());

		return repo.save(m);
	}

}
