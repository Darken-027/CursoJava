package org.example.areglos;

public class EncriptadorTexto {
    public static void main(String[] args) {
        Encriptador encriptador = new Encriptador();
        String texto = "Hola Mundo";
        String textoEncriptado = encriptador.desencriptar(texto);
        System.out.println("Texto Encriptado: " + textoEncriptado);
        String textoDesencriptado = encriptador.desencriptar(textoEncriptado);
        System.out.println("Texto Desencriptado: " + textoEncriptado);
    }
}
