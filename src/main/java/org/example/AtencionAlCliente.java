package org.example;

import java.util.Scanner;

public class AtencionAlCliente {
    public static void main(String[] args) {
        int opcionEscogidas = 1;
        while(opcionEscogidas != 0) {
            System.out.println("Eleja una opcion");
            System.out.println("1) Contactar con soporte tecnico");
            System.out.println("2) Compras");
            System.out.println("3) Marketing");
            System.out.println("4) Salir");

            Scanner teclado = new Scanner(System.in);
            opcionEscogidas = teclado.nextInt();

            if(opcionEscogidas == 1) {
                System.out.println("Llamando a soporte tecnico.....");
            }
            if(opcionEscogidas == 2) {
                System.out.println("Llamando a compras......");
            }
            if (opcionEscogidas == 3) {
                System.out.println("Llamando a marketing.....");
            }
        }
    }
}
