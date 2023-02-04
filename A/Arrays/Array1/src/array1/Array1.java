/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1;

/**
 *
 * @author Usuario
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] myArray=new int[5];
        myArray[0]=5;
        myArray[1]=51;
        myArray[2]=52;
        myArray[3]=54;
        myArray[4]=57;
        for(int i=0;i<myArray.length;i++){
            System.out.println("Valor del indice " + i + " = " + myArray[i]);
        }
    }
    
}
