package com.alexandre.vendas.repository;

import com.alexandre.vendas.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
