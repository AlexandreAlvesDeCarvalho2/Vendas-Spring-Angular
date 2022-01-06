package com.alexandre.vendas.controller;

import java.util.List;
import java.util.Optional;

import com.alexandre.vendas.model.Cliente;
import com.alexandre.vendas.repository.ClienteRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @GetMapping(value = "api/Cliente")
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @GetMapping(value = "api/Cliente/{id}")
    public Optional<Cliente> getById(@RequestParam Long id) {
        return clienteRepository.findById(id);
    }

    @PostMapping(value = "api/Cliente")
    public Cliente postMethod(@RequestBody Cliente entity) {
        return clienteRepository.save(entity);
    }

    @PutMapping(value = "api/Cliente/{id}")
    public Cliente putMethodName(@PathVariable String id, @RequestBody Cliente entity) {
        return clienteRepository.saveAndFlush(entity);
    }

    @DeleteMapping(value = "api/Cliente/{id}")
    public void deleteMethod(@RequestParam Long id) {
        clienteRepository.deleteById(id);
    }

}
