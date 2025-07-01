package org.example;

import java.util.Random;

public class NumeroRamdon {
    public static void main(String[] args) {
        // Calculando un numero Random
        int numero = 0;
        // numero = (int) (Math.random() * 100);
        Random random = new Random();
        numero = random.nextInt(100);
        System.out.println("Numero: " + numero);
    }
}
