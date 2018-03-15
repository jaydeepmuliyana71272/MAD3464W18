/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author macstudent
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Addition op1 = new Addition(); 
        op1.display(); 
        
        Counting cn1 = new Counting(); 
        cn1.display(); 
        
        B b1 = new B(); 
        b1.display(); 
        b1.calcDivision(); 
        b1.calcMultiplication(); 
        
        
    }
    
}

interface Arithmetic  
{
    int n1 = 10; 
    int n2 = 10; 
    
    void display(); 
    
} 

class Addition implements Arithmetic 
{
    @Override
    public void display() 
    {
      //  System.out.println("N1 + N2 = "+(n1+n2)); 
        System.out.println("Inside Addition"); 
    }
} 

class Counting extends Addition 
{
    
} 

interface multiplication extends Arithmetic 
{
    void calcMultiplication(); 
} 

class A implements multiplication 
{
    @Override
    public void display() 
    {
        System.out.println("N1 + N2 = "+(n1+n2));
    } 
    
    @Override
    public void calcMultiplication() 
    {
        System.out.println("N1 * N2 = "+(n1*n2));
    } 
} 

interface division extends Arithmetic 
{
    void calcDivision(); 
} 

class B extends Addition implements division, multiplication 
{

    @Override
    public void calcDivision() 
    {
        System.out.println("Division: "+(n1/n2)); 
    }

    @Override
    public void display() 
    {
        System.out.println("Inside calss B"); 
        System.out.println("N1 + N2: "+(n1+n2)); 
    }

    @Override
    public void calcMultiplication() 
    {
        System.out.println("Multiplication: "+(n1*n2)); 
    }
    
} 

class C extends B 
{
    int c1 = 20; 
}