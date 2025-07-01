package org.example;

import java.util.Scanner;

public class CalculadoraDeRenderizacion {
    public static void main(String[] args) {
        /*
         *  Calculadora de renderizado
         *  Para renderizar una pelicula 3D se
         *  contrata una empresa externa de render.
         *  Tienes que armar una calculadora que
         *  permita calcular el costo del render.
         *  Las variables son:
         *  - Precio por minuto de render
         *  - Cantidad de minutos a renderizar
         * */

        System.out.println("Indique la cantidad de minutos a grabar:");
        Scanner teclado = new Scanner(System.in);
        double cantidadMinutos = teclado.nextDouble();
        double precioPorMinuto = 0.05f;
        double precioFinal = precioPorMinuto * cantidadMinutos;
        System.out.println("El precio final: $" + precioFinal);
    }
}
