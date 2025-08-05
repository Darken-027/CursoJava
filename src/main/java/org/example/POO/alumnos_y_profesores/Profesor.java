package org.example.POO.alumnos_y_profesores;

public class Profesor extends Persona{
    private String materias;

    public Profesor(){
        super();

        super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,40));


    }
}
