package org.example.POO.alumnos_y_profesores;

public abstract class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
    //CONSTANTES
    private final String[] NOMBRES_CHICOS = {"pepe", "fernando", "alberto", "nacho"};
    private final String[] NOMBRES_CHICAS = {"alicia", "juana", "alberta", "urelia"};
    private final int CHICO = 0;
    private final int CHICAS = 1;


    public Persona(){
        int determinarSexo = MetodosSueltos.generaNumeroAleatorio(0,1);

        if (determinarSexo == CHICO) {
            nombre = NOMBRES_CHICOS[MetodosSueltos.generaNumeroAleatorio(0,5)];
            sexo = 'H';
        }else {
            nombre = NOMBRES_CHICAS[MetodosSueltos.generaNumeroAleatorio(0,5)];
            sexo = 'M';
        }
        disponibilidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getNOMBRES_CHICOS() {
        return NOMBRES_CHICOS;
    }

    public String[] getNOMBRES_CHICAS() {
        return NOMBRES_CHICAS;
    }

    public int getCHICO() {
        return CHICO;
    }

    public int getCHICAS() {
        return CHICAS;
    }


    public boolean isAsistencia() {
        return asistencia;
    }


    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public abstract void disponibilidad();

}
