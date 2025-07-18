package org.example.estructurasDeControl;

public class DeclaracionIf {
    public static void main(String[] args) {
        int numero = 10;

        //Comprueba si el numero es menor que 0
        if(numero < 0){
            System.out.println("El numero es negativo");
        }
        System.out.println("Sentencia fuera del bloque if");
    }
}
