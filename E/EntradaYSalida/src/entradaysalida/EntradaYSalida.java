/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaysalida;

import java.util.Scanner;

/**
 *
 * @author PC0
 */
public class EntradaYSalida {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre_usuario = Entrada.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = Entrada.nextInt();
        System.out.println("Hola " + nombre_usuario + " El año que viene tendras " + (edad+1) + " años");
        // TODO code application logic here
    }
    
}
