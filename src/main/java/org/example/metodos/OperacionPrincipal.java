package org.example.metodos;

public class OperacionPrincipal {

    //ATRIBUTOS
    //VARIABLES GLOBALES ES CUANDO ESTAN FUERA DE UN METODO
    int suma;
    int resta;
    int multiplicacion;
    int division;


    //METODOS

    //METODO PARA SUMAR AMBOS NUMEROS
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }

    //METODO PARA RESTAR AMBOS NUMEROS
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }

    //METODO PARA MULTIPLICAR AMBOS NUMEROS
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }

    //METODO PARA DIVIDIR AMBOS NUMEROS
    public void devidir(int numero1, int numero2){
        division = numero1 / numero2;
    }

    //METODO PARA MOSTRAR EL RESULTADO
    public void mostrarResultado(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
