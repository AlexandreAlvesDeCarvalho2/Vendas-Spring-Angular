package com.alexandre.vendas.repository;

import com.alexandre.vendas.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
