package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Employee;
import com.examly.springapp.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository repo;

    public boolean add(Employee employee){
        return repo.save(employee)!=null?true:false;
    }
    
}
