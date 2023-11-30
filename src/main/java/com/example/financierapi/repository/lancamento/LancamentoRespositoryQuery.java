package com.example.financierapi.repository.lancamento;

import com.example.financierapi.model.Lancamento;
import com.example.financierapi.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LancamentoRespositoryQuery {
    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
