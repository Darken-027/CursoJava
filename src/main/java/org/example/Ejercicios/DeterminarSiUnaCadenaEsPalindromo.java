package org.example.Ejercicios;

import java.util.Scanner;

public class DeterminarSiUnaCadenaEsPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena. ");
        String cadena = sc.next().toLowerCase();

        String reversa = "";

        for (int i = cadena.length() -1; i >= 0; i--){
            reversa += cadena.charAt(i);
        }

        if(cadena.equals(reversa)){
            System.out.println("Es palindromo");
        }else {
            System.out.println("No es un palindromo");
        }
    }
}
