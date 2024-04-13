package com.example.pah_1.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AppConfig {
    @Value("${app.studentName}")
    private String studentName;
    @Value("${app.studentDepartment}")
    private String studentDepartment;
    public String getStudentName() {
        return studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    

    
}

