package com.example.FoodManagement.controllers;

import com.example.FoodManagement.models.Food;
import com.example.FoodManagement.service.FoodDAOImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController extends GenericController<Food>{

    public FoodController(FoodDAOImpl ser) {
        super(ser);
    }
}
