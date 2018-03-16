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

import java.util.ArrayList; 
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here 
//        Books book1 = new Books(1,"THE SKY", 8); 
//        Books book2 = new Books(2,"Necklace", 3); 
//        Books book3 = new Books(3,"Milk", 2); 
//        Books book4 = new Books(4,"Journey", 3); 
//        Books book5 = new Books(5,"Wonderer", 4); 
//        
//        ArrayList<Books> library = new ArrayList<Books>(); 
//        library.add(book1); 
//        library.add(book2); 
//        library.add(book3); 
//        library.add(book4); 
//        library.add(book5); 
//        
//        System.out.println("No.of Books: "+library.size()); 
//        library.add(2,new Books(10,"Pacific",9)); 
//        
//        for (Books bk: library) 
//        {
//            bk.displayInfo(); 
//            
//        }
        
        
        Student st1 = new Student(101,"ABC", 87); 
        Student st2 = new Student(102,"DEF", 39); 
        Student st3 = new Student(103,"GHI", 72); 
        Student st4 = new Student(104,"JKL", 93); 
        Student st5 = new Student(105,"MNO", 64); 
        
        ArrayList<Student> data = new ArrayList<Student>(); 
        data.add(st1); 
        data.add(st2); 
        data.add(st3); 
        data.add(st4); 
        data.add(st5); 
        
        System.out.println("No.of Books: "+data.size()); 
        data.add(2,new Student(1010,"PQR",92)); 
        
        for (Student st: data) 
        {
            st.displayInfo(); 
            
        }
        
    }
    
}
