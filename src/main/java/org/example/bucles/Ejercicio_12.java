package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        /*
         *Write a program that asks the user for their age and displays on the screen all the
         * years they have completed (from 1 to their age).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Whic is your age.");
        int age = sc.nextInt();

        System.out.println("These are all your years since you were born.");

        for (int i = 0; i <= age; i++){
            System.out.println("You have fulfilled " + i + " years");
        }
    }
}
