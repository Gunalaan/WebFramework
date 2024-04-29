package com.example.day12_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.DilipEmployee;
import com.example.day12_01.repository.DilipEmployeeRepo;

@Service
public class DilipEmployeeService {
    @Autowired
    DilipEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DilipEmployee setEmployee(DilipEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DilipEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DilipEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
