package org.example.POO.alumnos_y_profesores;

public class Alumno extends Persona{

    private int nota;

    public Alumno(){
        super();

        nota =  MetodosSueltos.generaNumeroAleatorio(0,10);

        super.setEdad(MetodosSueltos.generaNumeroAleatorio(10, 15));
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean disponibilidad(){

        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);

        if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(false);
        }

    }

}
