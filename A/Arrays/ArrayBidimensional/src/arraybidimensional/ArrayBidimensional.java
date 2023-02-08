/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensional;
/**
 *
 * @author Usuario
 */
public class ArrayBidimensional {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz=new int[4][5];
            matriz [0][0] = 15;
            matriz [0][1] = 21;
            matriz [0][2] = 18;
            matriz [0][3] = 9;
            matriz [0][4] = 5;
		
            matriz [1][0] = 10;
            matriz [1][1] = 52;
            matriz [1][2] = 17;
            matriz [1][3] = 10;
            matriz [1][4] = 7;
		
            matriz [2][0] = 19;
            matriz [2][1] = 2;
            matriz [2][2] = 20;
            matriz [2][3] = 17;
            matriz [2][4] = 6;
		
            matriz [3][0] = 92;
            matriz [3][1] = 13;
            matriz [3][2] = 14;
            matriz [3][3] = 32;
            matriz [3][4] = 44;
            for (int i=0;i<4;i++){
                for (int j=0;j<5;j++){
                    System.out.println(matriz[i][j] + " ");
                }
            }
    }
}
