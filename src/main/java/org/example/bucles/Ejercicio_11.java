package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        /*
        Write a program that asks the user for
        a word and displays it on the screen 10 times.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra. ");
        String userWord = sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            System.out.println(userWord);
        }

    }
}
