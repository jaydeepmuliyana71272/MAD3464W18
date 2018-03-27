/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;

/**
 *
 * @author macstudent
 */
public class Employee implements java.io.Serializable 
{
    public String name; 
    public String address; 
    public int SSN; 
    public transient int number; 
    
    public void mailCheck() 
    {
        System.out.println("Mailing a check to "+name+ "" +address); 
        
    }
}
