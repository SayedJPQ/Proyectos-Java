/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaysalida;
import javax.swing.*;
/**
 *
 * @author PC0
 */
public class EntradaYSalida2 {
//Uso de formato de decimales y un input grafico
    public static void main(String[] args){
        double x=10000.0;
        System.out.printf("%1.2f",x/3);
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String edad =JOptionPane.showInputDialog("Introduce tu edad");
        int edad_usuario = Integer.parseInt(edad);
        System.out.println("\nHola " + nombre + " Tu edad es " + edad_usuario + " años");
    }
}
