package org.example.metodos;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        OperacionPrincipal op = new OperacionPrincipal ();

        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.devidir(n1,n2);
        op.mostrarResultado();
    }
}
