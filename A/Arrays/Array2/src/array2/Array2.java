/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;
/**
 *
 * @author Usuario
 */
import javax.swing.*;
public class Array2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] paises=new String[8];
        for (int i=0;i<8;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce pais "+(i+1));
        }
        for (String elemento:paises){
            System.out.println("Pais: " + elemento);
        }
    }
}
