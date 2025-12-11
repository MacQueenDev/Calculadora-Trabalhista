package com.github.macqueendev.calculadora_trabalhista_backend.controller;

import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoRequest;
import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoResponse;
import com.github.macqueendev.calculadora_trabalhista_backend.service.CalculadoraTrabalhistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculoController {

    @Autowired
    private CalculadoraTrabalhistaService service;

    @PostMapping("/calculos")
    public CalculoResponse calcular(@RequestBody CalculoRequest request) {
        return service.calcular(request);
    }
}
