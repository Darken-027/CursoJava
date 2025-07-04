package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;

        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();

        while (numero >= 0){
            contador++;
            System.out.println("La media es = " + suma/contador);
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }
    }
}
 