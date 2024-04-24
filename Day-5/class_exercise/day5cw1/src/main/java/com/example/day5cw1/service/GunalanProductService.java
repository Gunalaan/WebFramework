package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.model.GunalanProduct;
import com.example.day5cw1.repository.GunalanProductRepo;

@Service
public class GunalanProductService {
    public GunalanProductRepo productRepo;
    public GunalanProductService(GunalanProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(GunalanProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,GunalanProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public GunalanProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
