package org.example.areglos;

import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de Alumnos: ");
        int cantidadAlumnos = teclado.nextInt();

        String[] alumnos = new String[cantidadAlumnos];
        Float[] promedios = new Float[cantidadAlumnos];

        for(int i = 0; i < cantidadAlumnos; i++){
            System.out.print("Ingrese el nombre del Alumno: ");
            String nombreAlumno = teclado.next();
            alumnos[i] = nombreAlumno;

            System.out.print("Ingrese la nota del primer semestre: ");
            float nota1 = teclado.nextFloat();

            System.out.print("Ingrese la nota del segundo semeste: ");
            float nota2 = teclado.nextFloat();

            float promedio = (nota1 + nota2) / 2;
            promedios[i] = promedio;
            
            System.out.println("El promedio de : " + nombreAlumno + " es de: " + promedio);
        }
        for (String nombreAlumno : alumnos) {
            System.out.println(alumnos);
        }

        /**
         *Buena estartegia para solucionar un problema
         * Escribir primero los mensajes para darnos
         * cuenta como va a funcionar el codigo, como
         * fluira el codigo.
         */

    }
}
