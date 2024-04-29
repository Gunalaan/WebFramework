package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.GunalanPayroll;
import com.example.day14ce1.repository.GunalanPayrollRepo;

@Service
public class GunalanPayrollService {
    @Autowired
    GunalanPayrollRepo payrollRepo;

    public GunalanPayroll addPayroll(Long id,GunalanPayroll payroll)
    {
        GunalanPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<GunalanPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
