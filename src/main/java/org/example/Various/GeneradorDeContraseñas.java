package org.example.Various;


import java.security.SecureRandom;

public class GeneradorDeContraseñas {
    // Caracteres permitidos
    private static final String LETRAS_MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES_ESPECIALES = "!@#$%^&*()-_=+[]{}<>?/";

    private static final String TODOS_LOS_CARACTERES =
            LETRAS_MAYUSCULAS + LETRAS_MINUSCULAS + NUMEROS + CARACTERES_ESPECIALES;

    private static final int LONGITUD_CONTRASENA = 10;
    private static final int CANTIDAD_CONTRASENAS = 10;

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        System.out.println("GENERADOR DE CONTRASEÑAS");
        System.out.println("");
        for (int i = 0; i < CANTIDAD_CONTRASENAS; i++) {
            StringBuilder contrasena = new StringBuilder();

            for (int j = 0; j < LONGITUD_CONTRASENA; j++) {
                int index = random.nextInt(TODOS_LOS_CARACTERES.length());
                contrasena.append(TODOS_LOS_CARACTERES.charAt(index));
            }

            System.out.println("Contraseña " + (i + 1) + ": " + contrasena.toString());
        }
    }
}
