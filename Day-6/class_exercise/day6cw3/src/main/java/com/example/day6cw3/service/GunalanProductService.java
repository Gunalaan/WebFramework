package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.GunalanProduct;
import com.example.day6cw3.repository.GunalanProductRepo;

@Service
public class GunalanProductService {
    public GunalanProductRepo productRepo;
    public GunalanProductService(GunalanProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(GunalanProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<GunalanProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<GunalanProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public GunalanProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
