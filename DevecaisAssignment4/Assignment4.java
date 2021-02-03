/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import javax.swing.JOptionPane;
public class Assignment4 {
    
    
    public static void main(String[] args) {
        String convert = JOptionPane.showInputDialog("Please input 1 to convert Celcius to Farenhit and\n Input 2 to convert Farenhit to Celcius");

        
    switch(convert){
        case "1":
           double temp;
            
           temp = Double.parseDouble( JOptionPane.showInputDialog("Please input Celcius to be converted into Farenhit: "));
          
           double farenhit = (temp*9/5+32);
           JOptionPane.showMessageDialog(null,temp+"°C was converted to "+farenhit+" °F");
           break;
        case "2":
           
            
           temp = Double.parseDouble( JOptionPane.showInputDialog("Please input Farenhit to be converted into Celcius: "));
          
           double celcius = ((temp-32)*5/9);
           JOptionPane.showMessageDialog(null,temp+"°F was converted to "+celcius+" °C");
           break;
            
            
        default:
           JOptionPane.showMessageDialog(null,"Invalid input ","Warning",
                  JOptionPane.WARNING_MESSAGE);         
    }
    
    
    }
    
    
}
