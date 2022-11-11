package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.SuperClass;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenericDAOImpl<T extends SuperClass> implements GenericDAO<T>{

	List<T> cl;
	
	public GenericDAOImpl() {
		this.cl = new ArrayList<>();
	}
	
	@Override
	public List<T> getAll() {
		return cl;
	}

	@Override
	public T get(int id) {
		for(T c: cl) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	@Transactional
	@Override
	public boolean add(T t) {
		cl.add(t);
		return true;
	}

	@Transactional
	@Override
	public boolean update(int id, T t) {
		for(T c: cl) {
			if(c.getId() == id) {
				cl.set(id, t);
			}
		}
		return false;
	}

	@Transactional
	@Override
	public boolean delete(int id) {
		cl.remove(cl.get(id));
		return true;
	}	
}