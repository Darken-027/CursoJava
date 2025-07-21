package org.example.Ejercicios;

import java.util.Random;

public class LlenadoArreglosNumeroAleatorios {
    public static void main(String[] args) {
        int [] array = new int [10];
        Random mRamdom = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = mRamdom.nextInt(100);
            System.out.println("Array ");
        }
    }
}
