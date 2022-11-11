package com.example.FoodManagement.controllers;

import com.example.FoodManagement.repository.FoodDAOImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodController extends GenericController{

    public FoodController(FoodDAOImpl ser) {
        super(ser);
    }
}
