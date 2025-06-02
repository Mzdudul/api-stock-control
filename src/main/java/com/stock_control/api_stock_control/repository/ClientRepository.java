package com.stock_control.api_stock_control.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock_control.api_stock_control.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
