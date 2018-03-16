/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4abstract;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Day4Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here 
            //myShape s1 = new myShape(); 
        circle c1 = new circle(); 
        c1.draw(); 
        c1.display("Inside Circle"); 
        
        faculty f1 = new faculty(); 
        f1.read(); 
        f1.display(); 
        
        
    }
    
} 


abstract class myShape 
{
    int x; 
    int y; 
    
    abstract void draw(); 
    void display(String msg) 
    {
        System.out.println(msg); 
        
    }
}

class circle extends myShape 
{

    @Override
    void draw() 
    {
        System.out.println("Draw Circle "); 
        super.x = 20; 
        super.y = 30; 
        System.out.println("X: "+super.x+"Y: "+super.y); 
        
    } 
    
}

abstract class rectangle extends myShape 
{
    int h; 
    abstract void draw(); 
    
}

interface person 
{
    void read(); 
    void display(); 
    
}

abstract class employee 
{
    String type; 
    int salary; 
    
    void readData() 
    {
        System.out.println("Type:");
        Scanner tYp = new Scanner(System.in); 
        this.type = tYp.nextLine(); 
        System.out.println("Salary:");
        Scanner sLy = new Scanner(System.in); 
        this.salary = sLy.nextInt(); 
        
    } 
    
    void displayData() 
    {
        System.out.println("Type: "+type); 
        System.out.println("Sal: "+salary); 
    }
}

class faculty extends employee implements person 
{
    String name; 
    int age; 
    String field; 

    @Override
    public void read() 
    { 
        System.out.println("Enter Name: "); 
        Scanner nMe = new Scanner(System.in); 
        this.name = nMe.nextLine(); 
        System.out.println("Enter Age: "); 
        Scanner aGe = new Scanner(System.in); 
        this.age = aGe.nextInt(); 
        System.out.println("Enter Field: "); 
        Scanner fLd = new Scanner(System.in); 
        this.field = fLd.nextLine(); 
        super.readData(); 
        
    }

    @Override
    public void display() 
    {
        
          System.out.println("Name: "+name);
          System.out.println("Age: "+age); 
         // super.displayData(); 
          System.out.println("Field: "+field); 
          super.displayData(); 
    }
    
}