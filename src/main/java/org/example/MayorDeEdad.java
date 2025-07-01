package org.example;

import java.util.Scanner;

public class MayorDeEdad {
    public static void main(String[] args) {
        System.out.println("Ingrese su edad");
        Scanner teclado = new Scanner(System.in);
        int loQueEscrioElUsuario = teclado.nextInt();

        int edad = loQueEscrioElUsuario;
        if(edad >= 18) {
            System.out.println("El edad es mayor que 18");
        }else {
            System.out.println("El es menor que 18 años");
        }
    }
}
