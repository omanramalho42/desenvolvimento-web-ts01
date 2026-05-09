package com.spring.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.stock.model.Product;
import com.spring.stock.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository repo;

    @GetMapping()
    public List<Product> getAll() {
        return repo.findAll();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product) {
        return repo.save(product);
    }
    
    
}