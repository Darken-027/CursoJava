package org.example.arreglosLABDA;

public class Arreglo {
    public static void main(String[] args) {
        String [] dias = new String[7];
        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miercoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sabado";

        for(int i = 0; i < dias.length; i++){
            System.out.println("" + dias[i]);
        }

        System.out.println("Dia: " + dias[3]);
        System.out.println("Items: " + dias[3].length());
    }
}
