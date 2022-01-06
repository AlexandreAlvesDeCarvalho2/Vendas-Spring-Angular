package com.alexandre.vendas.controller;

import java.util.List;


import com.alexandre.vendas.model.Registro;
import com.alexandre.vendas.repository.RegistroRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class RegistroController {

    private final RegistroRepository registroRepository;


    @GetMapping(value = "api/Registro")
    public List<Registro> getAll() {
        return registroRepository.findAll();
    }


    
    @PostMapping(value = "api/Registro")
    public Registro postMethod(@RequestBody Registro entity) {
        return registroRepository.save(entity);
    }

    @PutMapping(value = "api/Registro/{id}")
    public Registro putMethodName(@PathVariable String id, @RequestBody Registro entity) {
        return registroRepository.saveAndFlush(entity);
    }

    @DeleteMapping(value = "api/Registro/{id}")
    public void deleteMethod(@PathVariable Long id) {
        registroRepository.deleteById(id);
    }


    
}
