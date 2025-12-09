package com.github.macqueendev.calculadora_trabalhista_backend.model;

public class CalculoRequest {

    private double salarioBruto;
    private int mesesTrabalhados;

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getMesesTrabalhados() {
        return mesesTrabalhados;
    }

    public void setMesesTrabalhados(int mesesTrabalhados) {
        this.mesesTrabalhados = mesesTrabalhados;
    }
}
