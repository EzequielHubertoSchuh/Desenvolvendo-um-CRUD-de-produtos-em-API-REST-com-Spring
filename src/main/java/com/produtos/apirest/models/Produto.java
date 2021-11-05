package com.produtos.apirest.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="TB_PRODUTOS")
public class Produto implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private BigDecimal quantidade;

    private BigDecimal valor;


}
