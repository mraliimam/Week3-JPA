package com.example.FoodManagement.service;

import com.example.FoodManagement.models.Food;
import com.example.FoodManagement.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodDAOImpl extends GenericDAOImpl<Food>{

	@Autowired
	private FoodRepository repo;

	@Override
	public Food update(Food f){
		Food f1 = repo.findById(f.getId()).orElse(null);

		f1.setId(f.getId());
		f1.setName(f.getName());
		f1.setFlavor(f.getFlavor());
		f1.setSize(f.getSize());
		f1.setPrice(f.getPrice());

		return repo.save(f1);
	}

}
