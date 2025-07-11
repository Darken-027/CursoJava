package org.example.areglos;

public class EncriptadorTexto {
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        String textoEncriptado = encriptar(texto);
        System.out.println("Texto Encriptado: " + textoEncriptado);
        String textoDesencriptado = desencriptar(textoEncriptado);
        System.out.println("Texto Desencriptado: " + textoEncriptado);
    }
}
