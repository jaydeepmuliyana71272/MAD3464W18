/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry;

import java.util.Scanner;

/**
 *
 * @author 710285
 */
public class Try {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int user;
        System.out.println("Enter User:");
        Scanner userchs = new Scanner(System.in);
        user = userchs.nextInt(); 
        
        if(user == 1)
        {
            passenger p1 = new passenger(); 
            p1.option(); 
        }
        else if(user == 2)
        {
            
        }
        else
        {
            
        }
    }
    
}
