package com.github.macqueendev.calculadora_trabalhista_backend.model;

public class CalculoResponse {

    private double feriasProporcionais;
    private double decimoTerceiroProporcional;
    private double total;

    public double getFeriasProporcionais() {
        return feriasProporcionais;
    }

    public void setFeriasProporcionais(double feriasProporcionais) {
        this.feriasProporcionais = feriasProporcionais;
    }

    public double getDecimoTerceiroProporcional() {
        return decimoTerceiroProporcional;
    }

    public void setDecimoTerceiroProporcional(double decimoTerceiroProporcional) {
        this.decimoTerceiroProporcional = decimoTerceiroProporcional;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
