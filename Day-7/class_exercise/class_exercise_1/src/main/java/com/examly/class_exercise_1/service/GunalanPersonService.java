package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.GunalanPerson;
import com.examly.class_exercise_1.repository.GunalanPersonRepo;

@Service
public class GunalanPersonService {

     @Autowired
     public GunalanPersonRepo personRepo;

     public GunalanPerson SaveEntity(GunalanPerson entity) {
          return personRepo.save(entity);

     }

     public List<GunalanPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<GunalanPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
