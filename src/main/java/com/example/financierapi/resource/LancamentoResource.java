package com.example.financierapi.resource;

import com.example.financierapi.event.RecursoCriadoEvent;
import com.example.financierapi.exceptionHandler.FinancierExceptionHandler;
import com.example.financierapi.model.Lancamento;
import com.example.financierapi.repository.LancamentoRepository;
import com.example.financierapi.service.LancamentoService;
import com.example.financierapi.service.exception.PessoaInativaException;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoResource {

    @Autowired
    private LancamentoRepository lancamentoRepository;
    @Autowired
    private MessageSource messageSource;

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping
    public List<Lancamento> listar() {
        return this.lancamentoRepository.findAll();
    }
    @GetMapping("/{codigo}")
    public ResponseEntity<Lancamento> buscarPeloCodigo (@PathVariable Long codigo) {
        Optional<Lancamento> lancamento = this.lancamentoRepository.findById(codigo);

        return lancamento.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Lancamento> criar(@Valid @RequestBody Lancamento lancamento, HttpServletResponse response){
        Lancamento lancamentoSalvo = lancamentoService.salvar(lancamento);

        publisher.publishEvent(new RecursoCriadoEvent(this,response,lancamentoSalvo.getCodigo()));

        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalvo);
    }

    @ExceptionHandler ({PessoaInativaException.class})
    public  ResponseEntity<Object> handlePessoaInativaException (PessoaInativaException ex) {
        String mensagemUsuario = messageSource.getMessage("pessoa.inexistente-ou-inativa",null, LocaleContextHolder.getLocale());
        String mensagemDesenvolvedor = ex.getCause() != null ? ex.getCause().toString() : ex.toString();

        List<FinancierExceptionHandler.Erro> erros = Arrays.asList(new FinancierExceptionHandler.Erro(mensagemUsuario,mensagemDesenvolvedor));

        return ResponseEntity.badRequest().body(erros);
    }
}
