package com.example.day5cw1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.model.GunalanProduct;

@Repository
public interface GunalanProductRepo extends JpaRepository<GunalanProduct,Integer>{
    
}
