package com.examly.class_exercise_1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.model.GunalanPerson;

/**
 * PersonRepo
 */
@Repository
public interface GunalanPersonRepo extends JpaRepository<GunalanPerson, Integer> {

     List<GunalanPerson> findByAge(int byAge);
}