package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
