package org.example.areglos;

import java.util.Scanner;

public class PiedraPapelTigera {
    public static void main(String[] args) {
        System.out.println("Jugemos a piedra papel o tigera");
        System.out.println("Escribe alguno de estos: piedra, papel o tijeras");


        //Pedirle al usuario que escoja
        Scanner teclado = new Scanner(System.in);
        String respuestaDelUsuario = teclado.nextLine();    


        //El usuario escribio papel
        System.out.println("La computadora escogio: papel");

        if(respuestaDelUsuario.equals("Piedra")){
            System.out.println("");
            System.out.println("");
        }

        System.out.println("EMPATE!");
    }
}
