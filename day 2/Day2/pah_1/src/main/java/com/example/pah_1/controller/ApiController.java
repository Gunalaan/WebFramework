package com.example.pah_1.controller;
import com.example.pah_1.model.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
    
    private final AppConfig ac;
  
    @Autowired
    public ApiController(AppConfig ac){

        this.ac=ac;

    }

    
    @GetMapping("/info")
    public String info(){
        return "Student Name:"+ac.getStudentName()+",Department:"+ac.getStudentDepartment();
    }
}





    

