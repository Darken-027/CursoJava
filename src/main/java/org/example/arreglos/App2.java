package org.example.arreglos;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres guardar. ");
        int longitud = sc.nextInt();

        int arreglo[] = new int[longitud];

        for (int i = 0; i < longitud; i++){
            int auxiliar;
            System.out.println("Ingresa el numero: ");
            auxiliar = sc.nextInt();

            arreglo[i] = auxiliar;
        }
    }
}
