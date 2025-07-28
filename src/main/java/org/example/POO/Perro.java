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

    public void comer(){
        System.out.println("comer......");
    }

    public void datos(){
        System.out.println("id: " + ID);
        System.out.println("raza: " + raza);
        System.out.println("precio: " + precio);
    }
}
