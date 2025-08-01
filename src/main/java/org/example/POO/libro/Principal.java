package org.example.POO.libro;

public class Principal {
    public static void main(String[] args) {

        Libro libro1 = new Libro(3164, "titulo1", "autor1", 30);
        Libro libro2 = new Libro(2541, "titulo2", "autor2", 20);


        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        libro1.setNumpaginas(80);

        if(libro1.getNumpaginas() > libro2.getNumpaginas()){
            System.out.println(libro1.getTitulo() + " tiene mas paginas");
        } else {
            System.out.println(libro2.getTitulo() + " tiene mas paginas");
        }
    }
}
