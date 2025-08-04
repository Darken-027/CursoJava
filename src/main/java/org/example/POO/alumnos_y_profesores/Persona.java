package org.example.POO.alumnos_y_profesores;

public class Persona {
    private String nombre;
    private char sexo;
    private int edad;

    //CONSTANTES
    private final String[] NOMBRES_CHICOS = {"pepe", "fernando", "alberto", "nacho"};
    private final String[] NOMBRES_CHICAS = {"alicia", "juana", "alberta", "urelia"};
    private final int CHICO = 0;
    private final int CHICAS = 1;


    public Persona(){
        int determinarSexo = MetodosSueltos.generaNumeroAleatorio(0,1);

        if (determinarSexo == 0) {
            nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0,4)];
            sexo = 'H'
        }else {
            nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0,4)];
            sexo = 'M';
        }


    }
}
