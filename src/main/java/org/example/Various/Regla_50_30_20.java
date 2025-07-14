package org.example.Various;

import java.util.Scanner;

public class Regla_50_30_20 {
    public static void main(String[] args) {
        // 50% Nececesidades
        // 30% Cosas que queremos
        // 20% Ahorros

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el salario que gana mensualmente: ");
        float salario = teclado.nextFloat();
        float necesidades = salario * 0.5f;
        float otrasCosas = salario * 0.3f;
        float ahorros = salario * 0.2f;
        System.out.println("Deberias de asignar tu salario en las siguientes");
        System.out.println("Necesidades: $ " + necesidades);
        System.out.println("Otras cosas: $ " + otrasCosas);
        System.out.println("Ahorros: $ " + ahorros);
    }
}
