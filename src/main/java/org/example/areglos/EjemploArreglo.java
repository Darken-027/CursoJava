package org.example.areglos;

public class EjemploArreglo {
    public static void main(String[] args) {

        //Declaracion de un arreglo
        String[] nombres;
        //Inicializacion de un arreglo
        nombres = new  String[4];
        String[] nombres2 = new String[4];

        nombres[0] = "Lucas";
        nombres[1] = "Maria";
        nombres[2] = "Pedro";
        nombres[3] = "Rodrigo";

        for(int i = 0; i < 4; i++){
            String nombre = nombres[i];
        }
    }
}
