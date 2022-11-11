package com.example.FoodManagement.controllers;

import com.example.FoodManagement.repository.EmployeeDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController extends GenericController{
    public EmployeeController(EmployeeDAOImpl gen) {
        super(gen);
    }
}
