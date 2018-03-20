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
public class passenger extends book 
{
    int option;
    void option() 
    {
        System.out.println("Select Option:"); 
        Scanner opt = new Scanner(System.in); 
        option = opt.nextInt(); 
        
         if(option == 1)
        {
             select_dept(); 
        }
        else if(option == 2)
        {
            
        }
        else if(option == 3)
        {
            
        }
        else
        {
            
        }
         
    }
}

abstract class book 
{
    void select_dept()
    {
        
        int dept;
        System.out.println("Select City"); 
        System.out.println("1)Ghar"); 
        System.out.println("2)Office"); 
        System.out.println("3)Friend Ghar"); 
        System.out.println("4)Girlfriend Ghar Street"); 
        Scanner depart = new Scanner(System.in); 
        dept = depart.nextInt(); 
        
        if (dept == 1)
        {
            String departure = "Ghar";
            System.out.println("Your Source : "+departure);
            select_dest(departure); 
        }
    
        
    }
    
    void select_dest(String de)
    {
        int dest;
        System.out.println("Select Destination City"); 
        System.out.println("1)Ghar"); 
        System.out.println("2)Office"); 
        System.out.println("3)Friend Ghar"); 
        System.out.println("4)Girlfriend Ghar Street"); 
        Scanner depart = new Scanner(System.in); 
        dest = depart.nextInt(); 
        
        if (dest == 1)
        {
            String desti = "Ghar";
            if (de == desti)
            {
                System.out.println("Both Same"); 
                select_dest(de); 
            }
            else
            {
            System.out.println("Your Dest : "+desti);
            }
        }
        
        System.out.println("1)Update"); 
        System.out.println("2)Conform");
        int cfr; 
        Scanner cfr1 = new Scanner(System.in);
        cfr = cfr1.nextInt(); 
        if(cfr == 1)
        {
            select_dept(); 
        }
        
    }
}