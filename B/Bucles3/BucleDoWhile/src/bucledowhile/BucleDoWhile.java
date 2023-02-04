/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucledowhile;
import javax.swing.*;
public class BucleDoWhile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String genero="";
        do{
            genero=JOptionPane.showInputDialog("Introduce tu genero: H/M");
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm:"));     
        int pesoIdeal=0;
        if(genero.equalsIgnoreCase("H")){
            pesoIdeal=altura-110;
        }
        else if (genero.equalsIgnoreCase("M")){
            pesoIdeal=altura-120;
        }
        System.out.println("Tu peso ideal es: " + pesoIdeal + " kgs");
    }
}

