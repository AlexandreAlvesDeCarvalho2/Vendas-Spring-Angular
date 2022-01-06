package com.alexandre.vendas.repository;

import com.alexandre.vendas.model.Vendedor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
    
}
