package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.GunalanStudent;
import com.example.bidirection.model.StudentInfo;
import com.example.bidirection.repository.GunalanStudentInfoRepository;
import com.example.bidirection.repository.StudentRepository;

@Service
public class GunalanStudentService {
    public StudentRepository studentRepository;
    public GunalanStudentInfoRepository studentInfoRepository;
    public GunalanStudentService(StudentRepository studentRepository,GunalanStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public GunalanStudent saveStudent(GunalanStudent student)
    {
        return studentRepository.save(student);
    }
    public StudentInfo saveStudentInfo(StudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<GunalanStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
