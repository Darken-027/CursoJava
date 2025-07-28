package org.example.POO;

public class auto {
    int modelo;
    String marca;

    //Creacion de un contructor
    public auto(int anio, String nombre){
        modelo = anio;
        marca = nombre;
    }

    public static void main(String[] args) {
        auto mi_auto = new auto(2018, "mazda");
    }
}



//FUNCION COMENTADA PARA NO ELIMINARLA Y TENER UNA REFERENCIA COMO EJEMPLO
/* public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void velocidad(int vel_max){
        System.out.println("La velocidad maxima es: " + vel_max + "Km/h");
    }

    public static void main(String[] args) {
        auto toyota = new auto();
        toyota.acelerar();
        toyota.velocidad(189);
    }*/