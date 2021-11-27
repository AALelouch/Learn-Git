package com.education_basics.apuntes_otras_cosas;

//Nuestro Plano
public class Calculadora {

    private int n1;
    private int n2;

    public void suma(){
        System.out.println("la suma es " + (n1 + n2));
    }

    //Nos retorna algo que queremos
    public int getN1() {
        return n1;
    }

    //Actualizamos una variable
    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {

        this.n2 = n2;
    }
}