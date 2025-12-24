package com.github.macqueendev.calculadora_trabalhista_backend.model;

public class CalculoRequest {

    private double salarioBruto;
    private int mesesTrabalhados;

    // NOVOS CAMPOS
    private int diasTrabalhadosNoMesDemissao;
    private int diasNoMesDemissao;

    public double getSalarioBruto() { return salarioBruto; }

    public void setSalarioBruto(double salarioBruto) { this.salarioBruto = salarioBruto; }

    public int getMesesTrabalhados() { return mesesTrabalhados; }

    public void setMesesTrabalhados(int mesesTrabalhados) { this.mesesTrabalhados = mesesTrabalhados; }

    public int getDiasTrabalhadosNoMesDemissao() { return diasTrabalhadosNoMesDemissao; }

    public void setDiasTrabalhadosNoMesDemissao(int diasTrabalhadosNoMesDemissao) {
        this.diasTrabalhadosNoMesDemissao = diasTrabalhadosNoMesDemissao;
    }

    public int getDiasNoMesDemissao() { return diasNoMesDemissao; }

    public void setDiasNoMesDemissao(int diasNoMesDemissao) {
        this.diasNoMesDemissao = diasNoMesDemissao;
    }

}
