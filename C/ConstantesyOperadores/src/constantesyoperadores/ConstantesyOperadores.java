/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantesyoperadores;
/**
 *
 * @author PC0
 */
public class ConstantesyOperadores {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double apulgadas = 2.54;
        double cm = 6;
        double resultado = cm/apulgadas;
        //Al usar final no se puede cambiar el valor mas adelante
        int a = 5;
        int b;
        b = 7;
        int c=a+b;
        c++;//Incremento en 1 de c
        c+=6;//Variante de incremento
        c-=2;//Decremento variante
        System.out.println("El resultado de c es: " + c);
        System.out.println("En " + cm + "cm hay " + resultado + "pulgadas");
    }
    
}
