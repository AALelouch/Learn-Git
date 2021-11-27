package com.education_basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Clase para ingresar datos
        Scanner input = new Scanner(System.in);

        //Flag para el menu principal
        boolean val;
        val = true;
        //Flag para el ciclo de crear
        boolean val2;
        val2 = true;

        while (val){
            System.out.println("Seleccione la funcion a la que desea acceder: ");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depocitar dinero");
            System.out.println("3. Calcular intereses");
            System.out.println("4. Retirar");
            System.out.println("5. Invertir");
            System.out.println("6. Salir");
            System.out.println("");

            System.out.println("Ingrese la opcion deseada");

            int op1;
            op1 = input.nextInt();

            if (op1==1){
                //Este ciclo se va a ejecutar hasta que val sea igual a false
                while (val2) {
                    System.out.println("Seleccione el tipo de cuenta que necesite crear: ");
                    System.out.println("1. Credito");
                    System.out.println("2. Debito");
                    System.out.println("3. Ahorro");
                    System.out.println("4. Salir");
                    System.out.println("");

                    System.out.print("Ingrese la opcion Deseada: ");


                    //Para la opcion entre tarjetas
                    int op2;
                    op2 = input.nextInt();

                    //Variables
                    double aper;

                    if (op2==1) {
                        System.out.println("Iniciando el Proceso para crear Tarjeta de Credito: ");
                        System.out.println("Ingrese el valor de apertura");

                        aper = input.nextInt();

                        Tarjeta_Credito tc1 = new Tarjeta_Credito(aper);
                    }
                    if (op2==2){
                        System.out.println("Iniciando el Proceso para crear Tarjeta de Debito: ");
                        System.out.println("Ingrese el valor de apertura");

                        aper = input.nextInt();

                        Tarjeta_Debito td1 = new Tarjeta_Debito(aper);
                    }
                    if (op2==3){
                        System.out.println("Iniciando el proceso para crear Cuenta de ahorros: ");
                        System.out.println("Ingrese el valor de apertura");

                        aper = input.nextInt();

                        Cuenta_Ahorro ca1 = new Cuenta_Ahorro(aper);
                    }
                    if (op2==4){
                        System.out.println("Gracias por usarme :D");
                        val2 = false;
                    }
                    if (op2!=1){
                        if (op2!=2){
                            if (op2!=3){
                                if (op2!=4){
                                    System.out.println("No ingreso una opcion valida");
                                }
                            }
                        }
                    }

                }
            }
            if (op1==6){
                System.out.println("Gracias por usarme");
                val = false;
            }
        }

    }
}
