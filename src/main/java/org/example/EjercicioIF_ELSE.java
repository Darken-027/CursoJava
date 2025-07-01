package org.example;

import java.util.Scanner;

public class EjercicioIF_ELSE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad = 0;
        double sueldo = 0, aporte = 0, procentaje = 0;

        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(teclado.nextLine());

        System.out.print("Ingresa tu sueldo anual: ");
        sueldo = Double.parseDouble(teclado.nextLine());

        if(edad > 0 && sueldo >0){
            if(sueldo < 10000){
                procentaje = 0.5;
            } else if(sueldo < 20000){
                procentaje = 1;
            } else if(sueldo < 30000){
                procentaje = 2.5;
            }

            aporte = sueldo * (procentaje / 100);

            if(edad <= 30){
               aporte = aporte + aporte * (20.0 /100);
            }

            System.out.println("El aporte es: $" + aporte);
        } else {
            System.out.println("Datos erroneos");
        }
    }
}
