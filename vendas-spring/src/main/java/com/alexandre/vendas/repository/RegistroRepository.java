package com.alexandre.vendas.repository;

import com.alexandre.vendas.model.Registro;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroRepository extends JpaRepository<Registro,Long> {
    
}
