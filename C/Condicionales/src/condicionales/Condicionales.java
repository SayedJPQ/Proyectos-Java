/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import java.util.Scanner;
/**
 *
 * @author PC0
 */
public class Condicionales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner entrada =new Scanner(System.in);
        System.out.println("Introduce tu edad por favor: ");
        int edad = entrada.nextInt();
        if (edad<18){
            System.out.println("Eres adolecente");
        }
        else if (edad == 18){
            System.out.println("Acabas de ser mayor de edad");
        }
        else{
            System.out.println("Eres un adulto");
        }
    }
}
