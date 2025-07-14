package org.example.areglos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Juanito");
        nombres.add("Maria");
        //Delte one List
        nombres.remove(1);
        for (String nombre: nombres){
            System.out.println(nombre);
        }
    }
}
