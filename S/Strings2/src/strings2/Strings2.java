/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings2;
/**
 *
 * @author PC0
 */
public class Strings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Frase = "Hola a todos estoy programando en Java";
        String Resumen = Frase.substring(19,38);
        String alumno1,alumno2;
        alumno1= "Sayed";
        alumno2= "sayed";
        System.out.println(Resumen);
        System.out.println(alumno1.equals(alumno2));
        //Ignora mayusculas y minusculas
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
    
}
