/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forlooppattern6;

/**
 *
 * @author Regret Martin
 */
public class ForLoopPattern6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i = 0;i<=5;i++)
        {
                         

            for (int j = 5;j>i ;j--) {  
                
                System.out.print(" ");  
                
            }
            for(int k = 0;k<i;k++){
                
                System.out.print(i - k);
  
            }
            for(int k = 0;k<i-1;k++){
            System.out.print(2+ k);
            
            }
             System.out.println();
        }
    }
    }
    

