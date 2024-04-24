package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.GunalanStudent;
import java.util.List;

@Repository
public interface GunalanStudentRepo extends JpaRepository<GunalanStudent, Long> {

    List<GunalanStudent> findByMarksGreaterThan(int mark);

    List<GunalanStudent> findByMarksLessThan(int mark);

}
