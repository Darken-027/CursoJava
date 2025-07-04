package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        for (int i = 0; i < 10; i++){
            System.out.println("Multiplica : " + i + " X " + numero + " = " + (i * numero));
        }
    }
}
