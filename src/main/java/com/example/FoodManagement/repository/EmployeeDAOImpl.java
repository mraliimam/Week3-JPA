package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeDAOImpl extends GenericDAOImpl<Employee>{

	List<Employee> emp;
	
	public EmployeeDAOImpl() {
		emp = new ArrayList<>();
	}

}