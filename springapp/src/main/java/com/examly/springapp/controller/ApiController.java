package com.examly.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Employee;
import com.examly.springapp.service.EmployeeService;

@RestController
public class ApiController {

    @Autowired
    public EmployeeService api;

    @PostMapping("/")
    public boolean addCar(@RequestBody Employee employee){
        return api.add(employee);
    }
    
    
    
}
