package org.example.POO.libro;

public class Libro {

    //Atributos
    private int ISBN;
    private String titulo;
    private String autor;
    private int numpaginas;

    //Contructores
    public Libro(int pISBN, String pTitulo, String pAutor, int pNumpaginas) {

        ISBN = pISBN;
        titulo = pTitulo;
        autor = pAutor;
        numpaginas = pNumpaginas;
    }

    //Metodos
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }


}
