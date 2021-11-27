package com.education_basics;

public class Tarjeta_Debito extends  CuentaBase{

    //Constructor
    public Tarjeta_Debito(double apertura){setMontoActual(apertura);}

    //Retirar Dinero
    public void Retirar(double retiro){
        setMontoActual(getMontoActual()-retiro);
    }
}
