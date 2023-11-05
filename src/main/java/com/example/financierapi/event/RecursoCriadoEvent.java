package com.example.financierapi.event;

import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.io.Serial;

@Getter
public class RecursoCriadoEvent extends ApplicationEvent {

    @Serial
    private static final long serialVersionUID = 1L;

    private HttpServletResponse response;
    private Long codigo;


    public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo ) {
        super(source);
        this.response = response;
        this.codigo = codigo;
    }


}
