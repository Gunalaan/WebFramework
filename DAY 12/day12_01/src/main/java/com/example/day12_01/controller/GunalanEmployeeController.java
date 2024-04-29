package com.example.day12_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12_01.model.DilipEmployee;
import com.example.day12_01.service.DilipEmployeeService;

@RestController
public class DilipEmployeeController {
    @Autowired
    DilipEmployeeService employeeService;

    @PostMapping("/employee")
    public DilipEmployee setMethod(@RequestBody DilipEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DilipEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DilipEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
