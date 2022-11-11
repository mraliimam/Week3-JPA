package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerDAOImpl extends GenericDAOImpl<Customer>{

	List<Customer> cust;
	
	
	public CustomerDAOImpl() {
		cust = new ArrayList<>();
	}

}
