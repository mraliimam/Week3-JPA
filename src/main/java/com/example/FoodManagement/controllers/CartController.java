package com.example.FoodManagement.controllers;

import com.example.FoodManagement.repository.CartDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController extends GenericController{
    public CartController(CartDAOImpl gen) {
        super(gen);
    }
}
