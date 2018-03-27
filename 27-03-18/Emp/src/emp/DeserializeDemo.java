/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp;
import java.io.*; 

/**
 *
 * @author macstudent
 */
public class DeserializeDemo 
{
    public static void main(String[] args) 
    {
        Employee e = null; 
        
//        e.name = "Jay"; 
//        e.address = "Toronto"; 
//        e.SSN = 1234567; 
//        e.number = 101; 
        
        try 
        {
            FileInputStream fileIn = new FileInputStream("employee.txt"); 
            ObjectInputStream in = new ObjectInputStream(fileIn); 
            
            e = (Employee) in.readObject(); 
            
            in.close(); 
            fileIn.close(); 
            
        }
        catch(IOException i) 
        {
            i.printStackTrace(); 
            return; 
            
        }
        catch(ClassNotFoundException c) 
        {
            System.out.println("Employee class not found"); 
            c.printStackTrace(); 
            return; 
        } 
        
        System.out.println("Deserialized Employee"); 
        System.out.println("Name: "+e.name); 
        System.out.println("Address: "+e.address+e.SSN+e.number); 
    }
}
