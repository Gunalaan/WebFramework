package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.GunalanStudent;
import com.examly.springapp.repository.GunalanStudentRepo;

@Service
public class GunalanStudentService {
    @Autowired
    private GunalanStudentRepo studentRepo;

    public boolean post(GunalanStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<GunalanStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<GunalanStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
