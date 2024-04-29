package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.GunalanEmployee;
import com.example.day14ce1.repository.GunalanEmployeeRepo;

@Service

public class GunalanEmployeeService {
    @Autowired
    GunalanEmployeeRepo employeeRepo;

    public GunalanEmployee addEmployee(GunalanEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<GunalanEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<GunalanEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
