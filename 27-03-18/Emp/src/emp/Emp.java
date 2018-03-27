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
public class Emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here 
        Employee e = new Employee(); 
        e.name = "Jay"; 
        e.address = "Toronto"; 
        e.SSN = 1234567; 
        e.number = 101; 
        
        try 
        {
            FileOutputStream fileOut = new FileOutputStream("employee.txt"); 
            ObjectOutputStream out = new ObjectOutputStream(fileOut); 
            
            out.writeObject(e); 
            
            out.close(); 
            fileOut.close(); 
            
            System.out.printf("Serialized data is saved"); 
            
        }
        catch(IOException i) 
        {
            i.printStackTrace(); 
        }
        
    }
    
}
