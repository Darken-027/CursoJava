package org.example.Ejercicios;

import java.util.Scanner;

public class LlenarUnArregloConNumerosAleatorios2 {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.println("Ingresa un numero ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            System.out.println("Array ( " + (i + 1) + " )" + " = " + array[i]);
        }
    }
}
