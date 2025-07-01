package org.example;

public class NumeroRamdon {
    public static void main(String[] args) {
        // Calculando un numero Random
        int numero = 0;
        numero = (int) (Math.random() * 100);
        System.out.println("Numero: " + numero);
    }
}
