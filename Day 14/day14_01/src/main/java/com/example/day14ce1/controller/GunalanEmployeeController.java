package com.example.day14ce1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.GunalanEmployee;
import com.example.day14ce1.service.GunalanEmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@Tag(name = "employee controller", description = "emp controller spin")
public class DilipEmployeeController {
    @Autowired
    GunalanEmployeeService employeeService;

    @PostMapping("/employee")
    public GunalanEmployee addEmployee(@RequestBody GunalanEmployee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employee")
    public List<GunalanEmployee> getMethodName() {
        return employeeService.getEmployees();
    }
    

    @GetMapping("/employee/{employeeId}")
    public Optional<GunalanEmployee> getMethodName(@PathVariable Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }
    
}
