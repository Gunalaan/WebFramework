package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.GunalanStudent;
import com.example.class_exercise_2.repository.GunalanStudentRepo;

@Service
public class GunalanStudentService {

     @Autowired
     public GunalanStudentRepo studentRepo;

     public List<GunalanStudent> getAll() {
          return studentRepo.findAll();
     }

     public GunalanStudent post(GunalanStudent student) {
          return studentRepo.save(student);
     }

     public List<GunalanStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
