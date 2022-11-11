package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.SuperClass;

import java.util.List;

public interface GenericDAO<T extends SuperClass> {

	//CRUD Operations
	
	public List<T> getAll();
	
	public T get(int id);
	
	public boolean add(T t);
	
	public boolean update(int id, T t);
	
	public boolean delete(int id);
	
}
