package com.alexandre.vendas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="vwproduto")
public class VwPedido {

    @Id
    @Column(name="id_pedido")
    private Long idpedido;

    @Column(name="nome_vendedor")
    private String nomevendedor;
    
    @Column(name="nome_cliente")
    private String nomecliente;

    @Column(name="descrição_produto")
    private String descricaoproduto;
    
    @Column(name="data_pedido")
    private String datapedido;
    
}
