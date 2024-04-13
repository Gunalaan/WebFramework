
package com.example.cy_1.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.cy_1.model.Department;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DepartmentController {
    @GetMapping("/department")
    public String postMethodName() {
        Department d=new Department("CSE","B.E");
        return "Department Name: "+d.getDepartmentName()+", Branch: "+d.getBranch();
    }
    
}