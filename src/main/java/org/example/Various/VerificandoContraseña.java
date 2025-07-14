package org.example.Various;

import java.util.Scanner;

public class VerificandoContraseña {
    public static void main(String[] args) {
        int intentos = 3;
        while(intentos < 3) {
            String password  = "chocolate";
            System.out.println("Ingrese la contraseña");
            Scanner teclado = new Scanner(System.in);
            String userPassword = teclado.nextLine();

            if(password.equals(userPassword)) {
                System.out.println("Inicio seccion corectamente");
                break;
            } else {
                System.out.println("Password incorrecto");
                intentos--;
                if(intentos == 0){
                    System.out.println("Cuenta bloqueada por 60 minutos");
                }else{
                    System.out.println("Intete de nuevo por favor");
                }
            }
        }
    }
}
