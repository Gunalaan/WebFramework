package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.GunalanPerson;
import com.example.springapp.repository.GunalanPersonRepo;

@Service
public class GunalanPersonService {
    @Autowired
    private GunalanPersonRepo rep;

    public boolean post(GunalanPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<GunalanPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<GunalanPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
