/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class ClassActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Faculty f1 = new Faculty(); 
        f1.readEmp(); 
        f1.displayEmp(); 
        
    }
    
} 

interface data 
{
    void readPerson(); 
    void displayPerson(); 
  //  void readEmp(); 
   // void displayEmp(); 
}

class Person implements data 
{

    String name; 
    int age; 
    
    @Override
    public void readPerson()
    {
        System.out.println("Enter Name: "); 
        Scanner nMe= new Scanner(System.in); 
        name = nMe.nextLine(); 
        System.out.println("Enter Age: "); 
        Scanner aGe = new Scanner(System.in); 
        age = aGe.nextInt(); 
        
    }

    @Override
    public void displayPerson()
    {
         System.out.println("Name: "+name); 
         System.out.println("Age: "+age); 
         
    }

  
}

interface Employee 
{

    
    
    
   
   // @Override
    public void readEmp() ;
   /* {
        System.out.println("Enter Job Type: "); 
        Scanner tYp= new Scanner(System.in); 
        type = tYp.nextLine(); 
        System.out.println("Enter Salary: "); 
        Scanner sLy = new Scanner(System.in); 
        salary = sLy.nextDouble(); 
    }*/

  //  @Override
    public void displayEmp() ;
   /* {
       System.out.println("Job Type: "+type); 
       System.out.println("Salary: "+salary); 
       
    }*/
    
} 

class Faculty extends Person implements Employee 
{

    String type; 
    Double salary; 
    String course; 
    
    @Override
    public void readEmp() 
    {
        super.readPerson(); 
        System.out.println("Enter Job Type: "); 
        Scanner tYp= new Scanner(System.in); 
        type = tYp.nextLine(); 
        System.out.println("Enter Salary: "); 
        Scanner sLy = new Scanner(System.in); 
        salary = sLy.nextDouble(); 
        System.out.println("Enter Course: "); 
        Scanner cRs = new Scanner(System.in); 
        course = cRs.nextLine(); 
        
    }

    @Override
    public void displayEmp() 
    {
       super.displayPerson();
       System.out.println("Job Type: "+type); 
       System.out.println("Salary: "+salary);
       System.out.println("Course: "+course); 
       
    }
    
}