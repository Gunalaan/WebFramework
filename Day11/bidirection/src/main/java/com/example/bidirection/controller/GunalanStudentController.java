package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.GunalanStudent;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.service.GunalanStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class GunalanStudentController {
    public GunalanStudentService studentService;
    public GunalanStudentController(GunalanStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public GunalanStudent postMethodName(@RequestBody GunalanStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public StudentInfo postMethodName(@RequestBody StudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<GunalanStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}