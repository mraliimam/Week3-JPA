package com.example.FoodManagement.repository;

import com.example.FoodManagement.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
