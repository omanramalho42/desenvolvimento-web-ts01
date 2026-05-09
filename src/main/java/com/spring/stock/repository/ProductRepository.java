package com.spring.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.stock.model.Product;

public class ProductRepository extends JpaRepository<Product, Long> {
    
}
