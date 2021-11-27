package com.education_basics;

public class Cuenta_Ahorro extends CuentaBase{

    //Constructor
    public  Cuenta_Ahorro(double apertura){
        setMontoActual(apertura);
    }

    //Invertir
    public void invertir(double inversion){
        setMontoActual(getMontoActual()+inversion);
    }

}
