package com.example.financierapi.repository;

import com.example.financierapi.model.Lancamento;
import com.example.financierapi.repository.lancamento.LancamentoRespositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRespositoryQuery {


}
