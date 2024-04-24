package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.GunalanStudent;
import com.example.class_exercise_2.service.GunalanStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class GunalanStudentController {

     @Autowired
     public GunalanStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<GunalanStudent>> getDetails() {
          List<GunalanStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<GunalanStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<GunalanStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<GunalanStudent> postMethodName(@RequestBody GunalanStudent student) {

          GunalanStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<GunalanStudent>> sortedDetails(@PathVariable String field) {
          List<GunalanStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<GunalanStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<GunalanStudent>>(list, HttpStatus.OK);

     }
}
