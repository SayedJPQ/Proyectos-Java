/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math1;

/**
 *
 * @author PC0
 */
public class Math1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raiz=Math.sqrt(9);
        float num1 = 5.8F;
        double num2 = 4.67;
        double base = 2;
        double exponente = 3;
        //No se puede convertir long a int a menos que lo refundamos
        int resultado = Math.round(num1);
        //Refundir
        int resultado2 = (int) Math.round(num2);
        int resultado3 = (int) Math.pow(base,exponente);
        System.out.println("La raiz es: " + raiz);
        System.out.println("El redondeo es: " + resultado);
        System.out.println("El segundo redondeo es: " + resultado2);
        System.out.println("El resultado de la potencia es: " + resultado3);
        // TODO code application logic here
    }
    
}
