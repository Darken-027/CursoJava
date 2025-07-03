package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*
        Escribe un programa que permita generar la tabla de multiplicar de
        un número entero positivo N,comenzando desde 1.
        Si el usuario escribe un número incorrecto, el programa
        no se ejecuta. En cambio, pregunta de nuevo por la información hasta
        que el dato ingresado sea correcto
         */

        Scanner t = new Scanner(System.in);
        boolean comprobar = true;
        int n;

        while(comprobar == true){
            System.out.print("Ingrese un numero entero positivo: ");
            n = t.nextInt();

            if(n > 0){
                for (int i = 1; i <= 10; i++){
                    System.out.println(n + " por " + i + " es igual a: " + n * i);
                }
                comprobar = false;
            }
            else{
                System.out.println("El numero ingresado no es correcto");
            }
        }
    }
}
