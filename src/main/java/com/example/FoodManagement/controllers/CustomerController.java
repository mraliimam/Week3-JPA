package com.example.FoodManagement.controllers;

import com.example.FoodManagement.models.Customer;
import com.example.FoodManagement.service.CustomerDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController extends GenericController<Customer>{
    public CustomerController(CustomerDAOImpl gen) {
        super(gen);
    }
}
