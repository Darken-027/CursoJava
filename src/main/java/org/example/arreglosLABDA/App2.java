package org.example.arreglosLABDA;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres guardar. ");
        int longitud = sc.nextInt();

        int arreglo[] = new int[longitud];
        //for para llenar el arreglo
        for (int i = 0; i < longitud; i++){
            int auxiliar;
            System.out.println("Ingresa el numero: " + (i + 1));
            auxiliar = sc.nextInt();

            arreglo[i] = auxiliar;
        }
        //for para imprimir el arreglo
        System.out.println("ARREGLO DESORDENADO: ");
        for (int i = 0; i < longitud; i++){
            System.out.println(arreglo[i]);
        }

        int guardado;
        for(int i = 0; i < (longitud-1); i++){

            for(int j = 0; j < (longitud-1); j++){
                if(arreglo[j] > arreglo[j+1]){
                    guardado = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = guardado;
                }
            }
        }

        System.out.println("ARREGLO ORDENADO: ");
        for (int i = 0; i < longitud; i++){
            System.out.println(arreglo[i]);
        }
    }
}

//Repostorio clonado














