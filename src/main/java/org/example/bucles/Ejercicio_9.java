package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        for(int i = numero + 1; i <= numero + 5; i++){
            System.out.println(i + " las operaciones son: " + " cuadrado = " + i * i + " cubo = " + i * i * i);
        }
    }
}
