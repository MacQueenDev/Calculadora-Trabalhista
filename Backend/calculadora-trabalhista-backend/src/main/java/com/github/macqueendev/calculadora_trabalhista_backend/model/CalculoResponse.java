package com.github.macqueendev.calculadora_trabalhista_backend.model;

public class CalculoResponse {

    private double saldoSalario;
    private double feriasVencidas;
    private double feriasProporcionais;
    private double tercoConstitucional;
    private double decimoTerceiroProporcional;
    private double avisoPrevio;
    private double fgtsMensal;
    private double multaFgts40;
    private double totalBruto;

    public double getSaldoSalario() {
        return saldoSalario;
    }

    public void setSaldoSalario(double saldoSalario) {
        this.saldoSalario = saldoSalario;
    }

    public double getFeriasVencidas() {
        return feriasVencidas;
    }

    public void setFeriasVencidas(double feriasVencidas) {
        this.feriasVencidas = feriasVencidas;
    }

    public double getFeriasProporcionais() {
        return feriasProporcionais;
    }

    public void setFeriasProporcionais(double feriasProporcionais) {
        this.feriasProporcionais = feriasProporcionais;
    }

    public double getTercoConstitucional() {
        return tercoConstitucional;
    }

    public void setTercoConstitucional(double tercoConstitucional) {
        this.tercoConstitucional = tercoConstitucional;
    }

    public double getDecimoTerceiroProporcional() {
        return decimoTerceiroProporcional;
    }

    public void setDecimoTerceiroProporcional(double decimoTerceiroProporcional) {
        this.decimoTerceiroProporcional = decimoTerceiroProporcional;
    }

    public double getAvisoPrevio() {
        return avisoPrevio;
    }

    public void setAvisoPrevio(double avisoPrevio) {
        this.avisoPrevio = avisoPrevio;
    }

    public double getFgtsMensal() {
        return fgtsMensal;
    }

    public void setFgtsMensal(double fgtsMensal) {
        this.fgtsMensal = fgtsMensal;
    }

    public double getMultaFgts40() {
        return multaFgts40;
    }

    public void setMultaFgts40(double multaFgts40) {
        this.multaFgts40 = multaFgts40;
    }

    public double getTotalBruto() {
        return totalBruto;
    }

    public void setTotalBruto(double totalBruto) {
        this.totalBruto = totalBruto;
    }
}
