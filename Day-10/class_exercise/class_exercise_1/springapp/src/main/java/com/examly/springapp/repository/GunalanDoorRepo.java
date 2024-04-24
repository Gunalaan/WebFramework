package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.GunalanDoor;

// import jakarta.transaction.Transactiona

@Repository
public interface GunalanDoorRepo extends JpaRepository<GunalanDoor, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<GunalanDoor> findByColor(String color);

    public List<GunalanDoor> findByDoorType(String doortype);
}
