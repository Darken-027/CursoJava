package org.example.Ejercicios;

import java.util.Scanner;

public class CaracteresQueSeRepitenEnUnaCadena {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cadena: ");
        String cadena = sc.nextLine();

        System.out.println(" - Ingresa el caracter a determinar el numero de repeticiones: ");
        char caracter = sc.next().charAt(0);

        int veces = 0;

        for (int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == caracter){
                veces++;
            }
        }
        System.out.println("El caracter \"" + caracter + "\" se repite " + veces + " veces" + " " +
                "en la cadena" +
                " \"" + cadena + "\" ");
    }
}
