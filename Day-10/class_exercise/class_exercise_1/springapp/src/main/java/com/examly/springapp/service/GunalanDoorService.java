package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.GunalanDoor;
import com.examly.springapp.repository.GunalanDoorRepo;

@Service
public class GunalanDoorService {
    @Autowired
    private GunalanDoorRepo doorRepo;

    public GunalanDoor postData(GunalanDoor door) {
        return doorRepo.save(door);
    }

    public List<GunalanDoor> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public GunalanDoor updateDetail(int doorid, GunalanDoor door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<GunalanDoor> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<GunalanDoor> getAllDetails() {

        return doorRepo.findAll();
    }

    public GunalanDoor getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}