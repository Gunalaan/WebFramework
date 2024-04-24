package com.example.day6cw3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.day6cw3.model.GunalanProduct;
import com.example.day6cw3.service.GunalanProductService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class GunalanProductController {
    public GunalanProductService productService;
    public GunalanProductController(GunalanProductService productService)
    {
        this.productService = productService;
    }
    @PostMapping("/api/product")
    public ResponseEntity<GunalanProduct> postMethodName(@RequestBody GunalanProduct product) {
        if(productService.postProduct(product))
        {
            return new ResponseEntity<>(product,HttpStatus.CREATED);
        }
        
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<GunalanProduct>> getMethodName(@PathVariable("offset") int offset,@PathVariable("pagesize") int size) {
        List<GunalanProduct> list = productService.pagination(offset,size);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<GunalanProduct>> getSortedPagination(@PathVariable("offset") int offset,@PathVariable("pagesize") int size,@PathVariable("field") String field) {
        List<GunalanProduct> list = productService.sortPagination(offset,size,field);
        if(list.size() == 0)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @GetMapping("/api/product/{productId}")
    public ResponseEntity<GunalanProduct> getMethodName(@PathVariable("productId") int id) {
        GunalanProduct product = productService.getProductById(id);
        if(product==null)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    
    
}
