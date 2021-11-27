package com.education_basics.apuntes_otras_cosas;

import java.util.Scanner;

public class Apuntes {
    public static void types_of_data(){

        /*Tipos de datos enteros, el primero es primitivo y el segundo es una clase*/

        int a = 21; /*max 2147483647 min -2147483648*/
        Integer aa;

        long b; /*max potencia no identificada*/
        long bb;

        short c; /*max 32767 min -32768*/
        Short cc;

        byte d; /*max 127 min -128*/
        Byte dd;

        /*Tipos de datos decimales, double es para decimales muy grandes y float para decimales mas pequeños*/

        double e; /*podemos colocar un 3.14d para decir que es un double*/
        Double ee;

        float f; /*podemos colocar un 3.14f para decir que es un float*/
        Float ff;

        /*Tipos de datos boleanos True or Flase*/

        boolean h = true;

        /*Caracteres o cadenas de texto, no tiene forma primitiva*/

        String i = "Hello";
    }

    public static void input_output(){

        // Clase para ingresar datos
        Scanner input = new Scanner(System.in);

        int n1;
        int n2;
        int r;

        System.out.println("n1:");

        //Lo usamos para ingresar datos
        n1 = input.nextInt();

        System.out.println("n2:");

        n2 = input.nextInt();
        r = n1 + n2;

        //%d hace referencia a un nuemro entero decimal y es fundamental para colocar r despues, %s es para strings
        System.out.printf("El resultado es: %d%n", r);
        //print es mas facil porque seria System.out.print("El resultado es: " + r);
    }

    public static void conditionals(){

        //Clase para ingresar datos
        Scanner input2 = new Scanner(System.in);

        int edad;

        System.out.println("Ingresa la edad:");
        edad = input2.nextInt();

        if (edad < 18)
            System.out.println("Es menor de edad");
        else
            System.out.println("Es mayor de edad");

    }

    public static void create_objets(){
        Calculadora PCal = new Calculadora();

        //Sets
        PCal.setN1(5);
        PCal.setN2(6);

        //Metodos
        PCal.suma();
    }

}

