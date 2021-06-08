/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;
/**
 *
 * @author PC0
 */
import javax.swing.*;
public class Bucles {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave = "Sayed";
        String pass = "";
        while (clave.equals(pass)==false){
            pass=JOptionPane.showInputDialog("Introduce la contraseña");
            if (clave.equals(pass)== false){
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Accesso permitido");
    }
}
