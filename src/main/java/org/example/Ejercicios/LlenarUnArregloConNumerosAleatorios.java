package org.example.Ejercicios;

import java.util.Random;

public class LlenarUnArregloConNumerosAleatorios {
    public static void main(String[] args) {
        int [] array = new int[10];
        Random mRandom = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = mRandom.nextInt(100);
            System.out.println("Array (" + (i + 1) + " = " + array[i]);
        }
    }
}
