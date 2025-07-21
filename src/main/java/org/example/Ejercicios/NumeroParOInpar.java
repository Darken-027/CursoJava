package org.example.Ejercicios;

import java.util.Scanner;

public class NumeroParOInpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0 ){
            System.out.println("ES PAR");
        }
        else{
            System.out.println("ES IMPAR");
        }
    }
}
