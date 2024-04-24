package com.example.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.GunalanPerson;
import com.example.springapp.repository.GunalanPersonRepo;

@Service
public class GunalanPersonService {
    public GunalanPersonRepo personRepo;

    public GunalanPersonService(GunalanPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(GunalanPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<GunalanPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
