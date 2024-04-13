package com.example.cw_3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw_3.model.Student;


@RestController
public class StudentController {
    @GetMapping("/path")
    public Student getMethodName() {
        Student a = new Student(1L, "John Doe", "This is a student description");
        return a;
    }
}
