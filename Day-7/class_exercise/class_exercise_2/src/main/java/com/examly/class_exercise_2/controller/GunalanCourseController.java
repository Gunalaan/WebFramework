package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.GunalanCourse;
import com.examly.class_exercise_2.service.GunalanCourseService;

@RestController
public class GunalanCourseController {

     @Autowired
     public GunalanCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<GunalanCourse> postMethodName(@RequestBody GunalanCourse entity) {

          GunalanCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<GunalanCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<GunalanCourse>> getMethodName() {

          List<GunalanCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<GunalanCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<GunalanCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<GunalanCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}