/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author macstudent
 */
public class Student 
{
    int number; 
    String name; 
    int per; 
    
     Student() 
    {
        this.number = 0; 
        this.name = "Unknown"; 
        this.per = 0; 
    } 
    
    Student(int number, String name, int per) 
    {
        this.number = number; 
        this.name = name; 
        this.per = per; 
        
    }
    
    void setID(int ID)
    {
        this.number = ID; 
    }
    
    int getID() 
    {
        return this.number; 
    } 
    
    void setName(String nMe) 
    {
        this.name = nMe; 
    } 
    
    String getName() 
    {
        return this.name; 
    } 
    
    void setPer(int per) 
    {
        this.per = per; 
    } 
    
    int getPer() 
    {
        return this.per; 
        
    }
    
    void displayInfo() 
    {
        System.out.println("Registraion ID: "+this.number+"\nName:: "+this.name+"\nPercentage: "+this.per); 
        
    }
    
}
