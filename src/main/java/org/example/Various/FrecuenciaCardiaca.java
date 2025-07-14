package org.example.Various;

import java.util.Scanner;

public class FrecuenciaCardiaca {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de respiraciones por minuto (RPM)");
        Scanner teclado = new Scanner(System.in);
        int respiraciones = teclado.nextInt();

        if(respiraciones >= 18 && respiraciones <= 20){
            System.out.println("La tasa de respiraciones por minutos esta en el rango normal");
        }
        else if(respiraciones < 18 && respiraciones > 20){
            System.out.println("La tasa de respiraciones por minuto esta en el rango bajo");
        }
    }
}
