package com.github.macqueendev.calculadora_trabalhista_backend.service;

import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoRequest;
import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraTrabalhistaService {

    public CalculoResponse calcular(CalculoRequest request) {
        double salario = request.getSalarioBruto();
        int meses = request.getMesesTrabalhados();

        double ferias = (salario / 12.0) * meses;
        double decimo = (salario / 12.0) * meses;
        double total = ferias + decimo;

        CalculoResponse response = new CalculoResponse();
        response.setFeriasProporcionais(ferias);
        response.setDecimoTerceiroProporcional(decimo);
        response.setTotal(total);

        return response;
    }
}
