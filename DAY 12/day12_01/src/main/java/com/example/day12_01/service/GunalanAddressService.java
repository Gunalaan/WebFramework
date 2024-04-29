package com.example.day12_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.DilipAddress;
import com.example.day12_01.repository.DilipAddressRepo;
import com.example.day12_01.repository.DilipEmployeeRepo;

@Service
public class DilipAddressService {
    @Autowired
    DilipAddressRepo addressRepo;
    @Autowired
    DilipEmployeeRepo employeeRepo;
    public DilipAddress setAddressById(int id,DilipAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
