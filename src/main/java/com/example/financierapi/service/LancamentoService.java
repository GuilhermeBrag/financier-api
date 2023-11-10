package com.example.financierapi.service;

import com.example.financierapi.model.Lancamento;
import com.example.financierapi.model.Pessoa;
import com.example.financierapi.repository.LancamentoRepository;
import com.example.financierapi.repository.PessoaRepository;
import com.example.financierapi.service.exception.PessoaInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;
    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
        if (pessoa.isEmpty() || pessoa.get().isInativo()) {
            throw new PessoaInativaException();
        }

        return lancamentoRepository.save(lancamento);
    }

}
