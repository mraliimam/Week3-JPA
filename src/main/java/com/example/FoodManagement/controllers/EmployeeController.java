package com.example.FoodManagement.controllers;

import com.example.FoodManagement.models.Employee;
import com.example.FoodManagement.service.EmployeeDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController extends GenericController<Employee>{
    public EmployeeController(EmployeeDAOImpl gen) {
        super(gen);
    }
}
