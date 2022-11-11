package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Food;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FoodDAOImpl extends GenericDAOImpl<Food>{

	List<Food> fd;
	
	public FoodDAOImpl() {
		fd = new LinkedList<>();
	}

}
