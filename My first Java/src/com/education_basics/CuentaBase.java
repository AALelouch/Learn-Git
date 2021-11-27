package com.education_basics;

public class CuentaBase {

    private double montoActual;

    //Setters
    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;
    }

    //Getters
    public double getMontoActual() {
        return montoActual;
    }

    public void depositar(double cantidad){
        setMontoActual(getMontoActual()+cantidad);
    }
}
