package com.example.FoodManagement.service;

import com.example.FoodManagement.models.Employee;
import com.example.FoodManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDAOImpl extends GenericDAOImpl<Employee>{

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee update(Employee e){
		Employee e1 = repo.findById(e.getId()).orElse(null);

		e1.setId(e.getId());
		e1.setName(e.getName());
		e1.setMobile(e.getMobile());
		e1.setEmail(e.getEmail());
		e1.setMenu(e.getMenu());

		return repo.save(e1);
	}
}