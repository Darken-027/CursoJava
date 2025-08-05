package org.example.POO.alumnos_y_profesores;

public class Profesor extends Persona{
    private String materias;

    public Profesor(){
        super();

        super.setEdad(MetodosSueltos.generaNumeroAleatorio(25,40));

        materias = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];

    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }
}
