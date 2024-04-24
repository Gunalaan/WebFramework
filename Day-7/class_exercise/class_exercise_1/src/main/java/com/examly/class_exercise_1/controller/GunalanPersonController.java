package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.GunalanPerson;
import com.examly.class_exercise_1.service.GunalanPersonService;

@RestController
public class GunalanPersonController {

     @Autowired
     public GunalanPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<GunalanPerson> postMethodName(@RequestBody GunalanPerson entity) {

          GunalanPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<GunalanPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<GunalanPerson>> getMethodName() {

          List<GunalanPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<GunalanPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<GunalanPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<GunalanPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}