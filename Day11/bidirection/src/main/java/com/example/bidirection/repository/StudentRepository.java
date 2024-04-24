package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.GunalanStudent;



@Repository
public interface StudentRepository extends JpaRepository<GunalanStudent,Integer>{
    
}
