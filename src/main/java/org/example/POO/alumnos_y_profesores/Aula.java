package org.example.POO.alumnos_y_profesores;

public class Aula {

    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;

    private final int MAX_ALUMNOS = 20;

    public Aula(){

        id = 1;

        profesor = new Profesor();
        alumnos = new Alumno[MAX_ALUMNOS];
        creaAlumno();
        materia = Constantes.MATERIAS[MetodosSueltos.generaNumeroAleatorio(0,2)];
    }

    private void creaAlumno(){
        for(int i = 0; i < alumnos.length; i++){
            alumnos[i] = new Alumno();
        }
    }

    private boolean asistenciaAlumnos(){
        int cuentaAsistencias = 0;
        for(int i = 0; i < alumnos.length; i++){
            if(alumnos[i].isAsistencia()){
                cuentaAsistencias++;
            }
        }

        return cuentaAsistencias >= ((int)MAX_ALUMNOS / 2);

    }

    public boolean darClase(){
        if(profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clases");
            return false;
        }else if(profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma");
            return false;
        }else if(!asistenciaAlumnos()){
            System.out.println("La asistencia no es suficiente");
            return false;
        }
        System.out.println("Se puede dar clases");
        return true;
    }
}
