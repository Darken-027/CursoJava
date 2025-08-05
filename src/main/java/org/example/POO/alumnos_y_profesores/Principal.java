package org.example.POO.alumnos_y_profesores;

public class Principal {
    public static void main(String[] args) {
        Aula aula = new Aula();
        if(aula.darClase()){
            aula.notas();
        }
    }
}
