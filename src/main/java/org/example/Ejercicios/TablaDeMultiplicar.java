package org.example.Ejercicios;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Tabla del " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println( num + " X " + i + " = " + num * i);
        }
    }
}
