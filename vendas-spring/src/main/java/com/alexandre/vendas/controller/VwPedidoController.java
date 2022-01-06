package com.alexandre.vendas.controller;

import java.util.List;

import com.alexandre.vendas.model.VwPedido;
import com.alexandre.vendas.repository.VwPedidoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class VwPedidoController {

    
    private final VwPedidoRepository vwPedidoRepository;

    @GetMapping(value = "api/VwPedido")
    public List<VwPedido> getAll() {
        return vwPedidoRepository.findAll();
    }
    
}
