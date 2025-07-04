package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        while (numero >= 0){
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
        }
    }
}
 