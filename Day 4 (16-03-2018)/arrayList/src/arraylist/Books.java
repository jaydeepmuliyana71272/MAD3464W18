/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books 
{
    int bookID; 
    String bookTitle; 
    int bookRating; 
    
    Books() 
    {
        this.bookID = 0; 
        this.bookTitle = "Unknown"; 
        this.bookRating = 0; 
    } 
    
    Books(int bookID, String bookTitle, int bookRating) 
    {
        this.bookID = bookID; 
        this.bookTitle = bookTitle; 
        this.bookRating = bookRating; 
        
    }
    
    void setID(int ID)
    {
        this.bookID = ID; 
    }
    
    int getID() 
    {
        return this.bookID; 
    } 
    
    void setTitle(String title) 
    {
        this.bookTitle = title; 
    } 
    
    String getTitle() 
    {
        return this.bookTitle; 
    } 
    
    void setRating(int rate) 
    {
        this.bookRating = rate; 
    } 
    
    int getRating() 
    {
        return this.bookRating; 
        
    }
    
    void displayInfo() 
    {
        System.out.println("BookID: "+this.bookID+"\nBook Title: "+this.bookTitle+"\nBook Rating: "+this.bookRating); 
        
    }
    
    class bookTitleComparator implements Comparator<Books> 
    {

        @Override
        public int compare(Books o1, Books o2) 
        {
            return o1.bookTitle.compareToIgnoreCase(o2.bookTitle); 
            
        }
        
    }
}
