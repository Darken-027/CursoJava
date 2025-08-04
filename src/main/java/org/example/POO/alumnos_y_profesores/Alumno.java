package org.example.POO.alumnos_y_profesores;

public class Alumno extends Persona{

    private int nota;

    public Alumno(){
        super();

        nota =  MetodosSueltos.generaNumeroAleatorio(0,10);
    }
}
