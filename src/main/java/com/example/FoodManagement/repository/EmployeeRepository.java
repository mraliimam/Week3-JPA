package com.example.FoodManagement.repository;

import com.example.FoodManagement.controllers.EmployeeController;
import com.example.FoodManagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
