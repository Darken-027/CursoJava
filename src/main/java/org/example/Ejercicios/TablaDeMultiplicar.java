package org.example.Ejercicios;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Ingrese un numero entre 1 y 10");
        int num = sc.nextInt();

        System.out.println("Tabla del " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println( num + " X " + i + " = " + num * i);
        }*/

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}
