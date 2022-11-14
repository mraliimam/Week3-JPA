package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}
