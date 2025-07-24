package org.example.arreglosLABDA;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Dame un numero");

        numero= sc.nextInt();

        int resultado = numero % 2;
        System.out.println("El resultado es: " + resultado);
    }
}
