package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.GunalanChildren;
import com.example.class_exercise_1.repository.GunalanChildrenRepo;

@Service
public class GunalanChildrenService {

     @Autowired
     public GunalanChildrenRepo childrenRepo;

     public List<GunalanChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public GunalanChildren save(GunalanChildren children) {
          return childrenRepo.save(children);

     }

     public List<GunalanChildren> sortedPage(int offset, int pagesize, String field) {
          Page<GunalanChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<GunalanChildren> pagination(int offset, int pagesize) {
          Page<GunalanChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
