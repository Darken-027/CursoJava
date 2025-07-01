package org.example;

import java.util.Scanner;

public class PrimeroAuxilosDeQuemaduras {
    public static void main(String[] args) {

        System.out.println("Primero tienes que reconocer que tipo de quemadura es");

        System.out.println("- Primer grado");
        System.out.println("Enrojecimiento, dolor leve y posible hinchazon");

        System.out.println("- Segundo grado");
        System.out.println("A,pollas, enrojecimiento, dolor intenso he hinchazon");

        System.out.println("- Tercer grado");
        System.out.println("Piel corbonizada, area insensible y potencialmente grave hinchazony daño tisular.");


        System.out.println("Ingrese el tipo de quemadura:");
        System.out.println("1) Primer grado");
        System.out.println("2) Segundo grado");
        System.out.println("3) Tercer grado");


        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();

        if(eleccion == 1){
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la zona");
            System.out.println("2. Limpiar suavemente la herida, y protegerla de infecciones");
            System.out.println("3. Aliviar el dolor");
        }
        if(eleccion == 2){
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la quemadura con agua fría");
            System.out.println("2. cubrirla con un vendaje estéri");
            System.out.println("3. Si es necesario, usar analgésicos y pomadas antibióticas");
        }
        if (eleccion == 3){
            System.out.println("Tratamiento:");
            System.out.println("1. Enfriar la quemadura con agua");
            System.out.println("2. Cubrirla con un vendaje limpio y seco");
            System.out.println("3. Desbridamiento (eliminación del tejido muerto)");
            System.out.println("4. Injertos de piel");
            System.out.println("5. control del dolor");
            System.out.println("6. prevención y tratamiento de infecciones");
        }
        else {
            System.out.println("Por favor ingrese un valor adecuado");
        }
    }
}
