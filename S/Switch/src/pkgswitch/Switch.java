/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import static java.lang.Math.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author PC0
 */
public class Switch {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectagulo \n3: Triangulo \n4: Circulo");
        int opcion=entrada.nextInt();
        switch(opcion){
            case 1:
                int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                System.out.println("El area del cuadrado es: " +  pow(lado,2));
                break;
            case 2:
                int largo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el largo"));
                int ancho=Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho"));
                System.out.println("El area del rectangulo es: " + largo * ancho);
                break;
            case 3:
                int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                System.out.println("El area del tirangulo es: " + (base * altura) /2);
                break;
            case 4:
                int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                System.out.print("El area del circulo es: ");
                System.out.printf("%1.2f",PI*(pow(radio,2)));
                break;
            default:
                System.out.println("La opcion no es correcta");
        }
    } 
}
