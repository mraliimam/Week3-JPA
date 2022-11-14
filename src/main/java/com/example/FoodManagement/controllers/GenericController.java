package com.example.FoodManagement.controllers;

import com.example.FoodManagement.models.SuperClass;
import com.example.FoodManagement.service.GenericDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GenericController<T> {

    private GenericDAOImpl<T> genericDAO;

    public GenericController(GenericDAOImpl<T> gen){
        this.genericDAO = gen;
    }

    @GetMapping("/entity/{id}")
    public T findEntity(@PathVariable int id){
        return genericDAO.get(id);
    }

    @GetMapping("/allEntities")
    public List<T> products(){
        return genericDAO.getAll();
    }

    @PostMapping("/addEntity")
    public T addEntity(@RequestBody T t){
        return genericDAO.add(t);
    }

    @PutMapping("/updateEntity")
    public T updateEntity(@RequestBody T t){
        return genericDAO.update(t);
    }

    @DeleteMapping("/deleteEntity/{id}")
    public boolean deleteEntity(@PathVariable int id){
        return genericDAO.delete(id);
    }

}
