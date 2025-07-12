package org.example;

import java.util.Scanner;

public class CalcularIVA {
    public static void main(String[] args) {
        /*
        *   Calcular IVA
        *   Lee un numero por teclado que pida
        *   el precio de un producto (Puede tener decimales)
        *   y calcule el precio final con IVA sera una
        *   constante que sera deñ 21%
        * */

        System.out.println("Ingrese el precio de un producto: ");
        Scanner teclado = new Scanner(System.in);
        float precio = teclado.nextFloat();

        float iva = 21;
        float totalADescontar = iva * precio / 100;
        float precioFinal = precio - totalADescontar;
        System.out.println("El precio de la IVA es: " + precioFinal);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
