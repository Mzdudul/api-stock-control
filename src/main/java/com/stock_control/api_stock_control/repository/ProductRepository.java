package com.stock_control.api_stock_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock_control.api_stock_control.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    
} 
