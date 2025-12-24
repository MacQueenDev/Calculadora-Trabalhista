package com.github.macqueendev.calculadora_trabalhista_backend.controller;

import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoRequest;
import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoResponse;
import com.github.macqueendev.calculadora_trabalhista_backend.service.CalculadoraTrabalhistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculoController {

    @Autowired
    private CalculadoraTrabalhistaService calculadoraTrabalhistaService;

    @PostMapping("/calculos")
    public ResponseEntity<CalculoResponse> calcular(@RequestBody CalculoRequest request) {
        CalculoResponse response = calculadoraTrabalhistaService.calcularRescisao(request);
        return ResponseEntity.ok(response);
    }
}

