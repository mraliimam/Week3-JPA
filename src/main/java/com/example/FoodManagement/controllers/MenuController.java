package com.example.FoodManagement.controllers;

import com.example.FoodManagement.repository.MenuDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/menu")
public class MenuController extends GenericController{

    public MenuController(MenuDAOImpl gen) {
        super(gen);
    }
}
