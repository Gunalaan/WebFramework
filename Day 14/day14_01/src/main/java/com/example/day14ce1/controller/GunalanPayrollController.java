package com.example.day14ce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.GunalanPayroll;
import com.example.day14ce1.service.GunalanPayrollService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class GunalanPayrollController {
    @Autowired
    GunalanPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public GunalanPayroll addPayroll(@PathVariable Long employeeId,@RequestBody GunalanPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<GunalanPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
