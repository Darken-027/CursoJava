package org.example.arreglos;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] apellidos = new String[5];
        int sumaPrecios = 0;

        apellidos[0] = "Hamby";
        apellidos[1] = "Maria";
        apellidos[2] = "Luiz";
        apellidos[3] = "Rio";
        apellidos[4] = "Sao Paulo";

        for (int i = 0; i < apellidos.length; i++){
            System.out.println(apellidos[i]);
        }

        int precios [] = new int[2];

        for (int i = 0; i < precios.length; i++){
            System.out.println("Dame un precio: ");
            precios[0] = sc.nextInt();
        }
        for (int i = 0; i < precios.length; i++){
            System.out.println(precios[i]);
        }

        for(int i = 0; i < precios.length; i++){
            sumaPrecios = precios[i];
        }

        for(int i = 0; i < precios.length; i++){
            sumaPrecios = precios[i];
        }
    }
}
