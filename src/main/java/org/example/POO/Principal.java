package org.example.POO;

public class Principal {
    public static void main(String[] args) {
        Perro perro_uno = new Perro(12, "pastor aleman", 80000);
        Perro laika = new Perro(8893, "doberman", 100000);
        perro_uno.correr();
        laika.comer();
   }
}
