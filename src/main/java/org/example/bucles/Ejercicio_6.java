package org.example.bucles;

import java.util.Scanner;

public class Ejercicio_6 {
    /*
    * autenticar un usuario y contraseña
    * cuando la contraseña y el usuario son incorrectos
    * este cuente  como un intento de maximo
    * 5 intentos, depues de que se acabe
    * la validacion mandar un mensaje a la pantalla que dija,
    * entraste a la caje de forma exitosa, pero si te equivocas
    * bloquear la caja para siempre
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contraseña = 111;
        for(int i = 0; i < 4; i++){
            System.out.println("Introduce la contraseña");
            int intento = sc.nextInt();

            if(intento == contraseña){
                System.out.println("Se abrio la caja");
                break;
            }
            else {
                System.out.println("Contraseña incorrecta");
            }
        }
    }
}
