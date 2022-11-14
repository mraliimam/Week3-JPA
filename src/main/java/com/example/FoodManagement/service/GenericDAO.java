package com.example.FoodManagement.service;

import com.example.FoodManagement.models.SuperClass;
import java.util.List;

public interface GenericDAO<T> {

	//CRUD Operations
	
	public List<T> getAll();
	
	public T get(int id);
	
	public T add(T t);
	
	public T update(T t);
	
	public boolean delete(int id);
	
}
