package com.example.financierapi.repository.lancamento;

import com.example.financierapi.model.Lancamento;
import com.example.financierapi.repository.LancamentoRepository;
import com.example.financierapi.repository.filter.LancamentoFilter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LancamentoRespositoryQuery {
    public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
