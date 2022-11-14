package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {
}
