package org.example.Ejercicios;

import java.util.Scanner;

public class pedirNumeroUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        int num = 0;

        while(opc != 2){
            System.out.println("Ingrese un numero");
            num = sc.nextLine();
        }
    }
}
