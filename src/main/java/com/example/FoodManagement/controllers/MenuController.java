package com.example.FoodManagement.controllers;

import com.example.FoodManagement.models.Menu;
import com.example.FoodManagement.service.MenuDAOImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/menu")
public class MenuController extends GenericController<Menu>{

    public MenuController(MenuDAOImpl gen) {
        super(gen);
    }
}
