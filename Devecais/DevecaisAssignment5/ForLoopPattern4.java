/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlooppattern4;

/**
 *
 * @author Regret Martin
 */
public class ForLoopPattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0;i<=5;i++)
        {
              
            for (int j = 0;j<=5-i;j++)         
                System.out.print(" ");              
            
            for(int k = 1;k<=2*i-1;k++)
              System.out.print("*");
              System.out.println();
        }
    }
    
}
