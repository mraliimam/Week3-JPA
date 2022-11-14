package com.example.FoodManagement.controllers;

import com.example.FoodManagement.models.Cart;
import com.example.FoodManagement.service.CartDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController extends GenericController<Cart>{
    public CartController(CartDAOImpl gen) {
        super(gen);
    }
}
