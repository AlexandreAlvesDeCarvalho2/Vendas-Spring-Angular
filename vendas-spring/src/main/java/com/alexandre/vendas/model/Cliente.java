package com.alexandre.vendas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="cliente")
public class Cliente {

    @Id
    @Column(name="id_cliente")
    private Long idcliente;

    @Column(name="nome_cliente")
    private String nomecliente;

    @Column(name="email_cliente")
    private String emailcliente;

    @Column(name="telefone_cliente")
    private String telefonecliente;
    
}
