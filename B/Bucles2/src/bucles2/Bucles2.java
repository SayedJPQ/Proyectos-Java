/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles2;
/**
 *
 * @author PC0
 */
import static java.lang.Math.*;
import java.util.*;
public class Bucles2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio=(int)(random()*100);
        Scanner entrada = new Scanner(System.in);
        int numero=0;
        int intentos=0;
        while(numero!=aleatorio){
            intentos++;
            System.out.println("Introduzca un numero");
            numero=entrada.nextInt();
            if (aleatorio<numero){
                System.out.println("Debes poner un numero menor");
            }
            else if (aleatorio>numero){
                System.out.println("Debes poner un numero mayor");
            }
        }
        System.out.println("Enhorabuena lo has conseguido en: " + intentos + " intentos");
    }
}
