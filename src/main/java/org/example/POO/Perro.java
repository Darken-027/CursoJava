package org.example.POO;

public class Perro {
    int ID;
    String raza;
    int precio;

    //Contructor
    public Perro (int ID, String raza, int precio){
        this.ID = ID;
        this.raza = raza;
        this.precio = precio;
    }

    public void correr(){
        System.out.println("Perro corriendo......");
    }
}
