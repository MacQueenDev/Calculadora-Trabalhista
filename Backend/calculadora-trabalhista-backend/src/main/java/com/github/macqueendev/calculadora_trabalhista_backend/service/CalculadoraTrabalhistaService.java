package com.github.macqueendev.calculadora_trabalhista_backend.service;

import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoRequest;
import com.github.macqueendev.calculadora_trabalhista_backend.model.CalculoResponse;
import org.springframework.stereotype.Service;


@Service
public class CalculadoraTrabalhistaService {

    public CalculoResponse calcularRescisao(CalculoRequest request) {
        CalculoResponse response = new CalculoResponse();

        double saldoSalario = calcularSaldoSalario(request);
        double feriasVencidas = calcularFeriasVencidas(request);
        double feriasProporcionais = calcularFeriasProporcionais(request);
        double tercoConstitucional = calcularTercoConstitucional(feriasVencidas, feriasProporcionais);
        double decimoTerceiroProporcional = calcularDecimoTerceiroProporcional(request);
        double avisoPrevio = calcularAvisoPrevio(request);
        double fgtsMensal = calcularFgtsMensal(request);
        double multaFgts40 = calcularMultaFgts40(request);

        double totalBruto = saldoSalario
                + feriasVencidas
                + feriasProporcionais
                + tercoConstitucional
                + decimoTerceiroProporcional
                + fgtsMensal
                + avisoPrevio
                + multaFgts40;

        response.setSaldoSalario(saldoSalario);
        response.setFeriasVencidas(feriasVencidas);
        response.setFeriasProporcionais(feriasProporcionais);
        response.setTercoConstitucional(tercoConstitucional);
        response.setDecimoTerceiroProporcional(decimoTerceiroProporcional);
        response.setAvisoPrevio(avisoPrevio);
        response.setFgtsMensal(fgtsMensal);
        response.setMultaFgts40(multaFgts40);
        response.setTotalBruto(totalBruto);

        return response;
    }

    private double calcularSaldoSalario(CalculoRequest request) {
        int diasTrabalhados = request.getDiasTrabalhadosNoMesDemissao();
        int diasNoMes = request.getDiasNoMesDemissao();

        if (diasTrabalhados <= 0 || diasNoMes <= 0) {
            return 0.0;
        }

        double valorDia = request.getSalarioBruto() / diasNoMes;
        return valorDia * diasTrabalhados;
    }

    private double calcularFeriasVencidas(CalculoRequest request) {
        // Por enquanto, deixa 0 até definirmos a regra
        return 0.0;
    }

    private double calcularFeriasProporcionais(CalculoRequest request) {
        int mesesTrabalhados = request.getMesesTrabalhados();

        if (mesesTrabalhados <= 0) {
            return 0.0;
        }
        if (mesesTrabalhados > 12) {
            mesesTrabalhados = 12;
        }

        double salario = request.getSalarioBruto();
        return salario * mesesTrabalhados / 12.0;
    }


    private double calcularTercoConstitucional(double feriasVencidas, double feriasProporcionais) {
        // 1/3 sobre a soma das férias (vencidas + proporcionais)
        double totalFerias = feriasVencidas + feriasProporcionais ;
        return totalFerias / 3.0;
    }

    private double calcularDecimoTerceiroProporcional(CalculoRequest request) {
        int mesesTrabalhadosNoAno = request.getMesesTrabalhados();

        if (mesesTrabalhadosNoAno <= 0) {
            return 0.0;
        }
        if (mesesTrabalhadosNoAno > 12) {
            mesesTrabalhadosNoAno = 12;
        }

        double salario = request.getSalarioBruto();
        return salario * mesesTrabalhadosNoAno / 12.0;
    }

    private double calcularAvisoPrevio(CalculoRequest request) {
        // Por enquanto, 0 até incluirmos tipoRescisao/anosTrabalhados
        return 0.0;
    }

    private double calcularFgtsMensal(CalculoRequest request) {
        // 8% do salário bruto
        return request.getSalarioBruto() * 0.08;
    }

    private double calcularMultaFgts40(CalculoRequest request) {
        // Por enquanto, 0 até termos saldoFgts e tipoRescisao
        return 0.0;
    }}
