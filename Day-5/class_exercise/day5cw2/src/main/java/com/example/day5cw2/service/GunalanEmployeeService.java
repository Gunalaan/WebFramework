package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.Gunalan;
import com.example.day5cw2.repository.GunalanEmployeeRepo;

@Service
public class GunalanEmployeeService {
    public GunalanEmployeeRepo employeeRepo;
    public GunalanEmployeeService(GunalanEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(Gunalan employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Gunalan employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public Gunalan getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
