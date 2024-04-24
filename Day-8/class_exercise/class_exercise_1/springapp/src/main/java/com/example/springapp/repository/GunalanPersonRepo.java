package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.GunalanPerson;
import java.util.List;


@Repository
public interface GunalanPersonRepo extends JpaRepository<GunalanPerson,Integer>{

    List<GunalanPerson> findByNameStartingWith(String name);
    List<GunalanPerson> findByNameEndingWith(String name);
    
}
