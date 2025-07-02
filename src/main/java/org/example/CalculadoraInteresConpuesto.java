package org.example;

public class CalculadoraInteresConpuesto {
    public static void main(String[] args) {
        float capitalInicial = 1000;
        float adicionAnual = 10000;
        float tasaInteres = 0.05f; //5%
        int periodoAnos = 5;

        float montoFinal = capitalInicial;
        for (int i = 0; i < periodoAnos; i++){
            float crecimientoAnual = montoFinal * tasaInteres;
            montoFinal += crecimientoAnual;
            montoFinal += adicionAnual;

        }
        System.out.println(montoFinal);
    }

}