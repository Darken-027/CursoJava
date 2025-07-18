package org.example.estructurasDeControl;

public class Declaracion_if_else {
    public static void main(String[] args) {
        int numero = 10;
        //Comprueva si el numero es mayor que 0
        if(numero > 0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero no es positivo");
        }
        System.out.println("Sentencia fuera del bloque if");
    }
}
