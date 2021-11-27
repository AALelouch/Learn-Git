package com.education_basics;

public class Tarjeta_Credito extends CuentaBase{

    //Constructor
    public Tarjeta_Credito(double apertura){
        setMontoActual(apertura);
    }

    //Metodo para sumar el interes al saldo de la tarjeta
    public double sumaIntereses(double intereses){
        setMontoActual(getMontoActual()+(getMontoActual()*intereses));
        return getMontoActual();
    }
}
