package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuDAOImpl extends GenericDAOImpl<Menu>{

	List<Menu> menu;
	
	public MenuDAOImpl() {
		menu = new ArrayList<>();
	}

}
