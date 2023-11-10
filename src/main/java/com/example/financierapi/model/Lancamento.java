package com.example.financierapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.HashCodeExclude;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "lancamento")
public class Lancamento {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    private String descricao;

    @NotNull
    @Column(name = "data_vencimento")
    private LocalDate dataVencimento;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;
    @NotNull
    private BigDecimal valor;

    private String observacao;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoLancamento tipo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "codigo_categoria")
    private Categoria categoria;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "codigo_pessoa")
    private Pessoa pessoa;



}
