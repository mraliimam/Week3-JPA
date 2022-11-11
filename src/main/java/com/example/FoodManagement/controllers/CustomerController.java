package com.example.FoodManagement.controllers;

import com.example.FoodManagement.repository.CustomerDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController extends GenericController{
    public CustomerController(CustomerDAOImpl gen) {
        super(gen);
    }
}
