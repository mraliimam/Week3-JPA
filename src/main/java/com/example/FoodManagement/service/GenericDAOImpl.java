package com.example.FoodManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class GenericDAOImpl<T> implements GenericDAO<T> {

	@Autowired
	private JpaRepository<T,Integer> repo;

	@Override
	public List<T> getAll() {
		return repo.findAll();
	}

	@Override
	public T get(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public T add(T t) {
		return repo.save(t);
	}

	@Override
	public boolean delete(int id) {
		repo.deleteById(id);
		return true;
	}	
}