package org.example.areglos;

import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        System.out.println("What do you want to cook");
        System.out.println("Mofongo");
        System.out.println("Fried ice cream");
        System.out.println("Zurek");

        //The user chooses an option
        Scanner sc = new Scanner(System.in);
        String chooseOption = sc.nextLine();

        //Showing the ingredients
        System.out.println("Necessary Ingredients");
        System.out.println("- salt");
        System.out.println("- Water");

        //Showing the steps
        System.out.println("Steps");
        System.out.println("- Heat a pan over low heat");
    }
}
