package org.example.areglos;

public class EnbudoVentas {
    public static void main(String[] args) {
        int prospectos = 10000;
        System.out.println("Etapa 0: Hay " + prospectos + " prospectos.");
        
        String etapa1 = "Se le envia un email";
        int porcentaje1 = 25;
        prospectos = porcentaje1 * prospectos / 100;
        System.out.println("Etapa 1: Hay " + prospectos + " prospectos.");


        String etapa2 = "El prospecto ingresa a la web";
        int procentaje2 = 10;
        prospectos = procentaje2 * prospectos / 100;
        System.out.println("Etapa 2: Hay " + prospectos + " prospectos.");


        String etapa3 = "El prospecto ingresa a la seccion de compras";
        int procentaje3 = 10;
        prospectos = procentaje3 * prospectos / 100;
        System.out.println("Etapa 3: Hay " + prospectos + " prospectos.");


        String etapa4 = "El prospecto compra el producto";
        int procentaje4 = 10;
        prospectos = procentaje4 * prospectos / 100;
        System.out.println("Etapa 4: Hay " + prospectos + " prospectos.");

    }
}
