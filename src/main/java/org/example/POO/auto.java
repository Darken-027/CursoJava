package org.example.POO;

public class auto {
    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void velocidad(int vel_max){
        System.out.println("La velocidad maxima es: " + vel_max + "Km/h");
    }

    public static void main(String[] args) {
        auto toyota = new auto();
        toyota.acelerar();
        toyota.velocidad(189);
    }
}