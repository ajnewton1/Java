// Account: ajn54
// Author: Aaron Newton
// Completion time: 3 hours
// Honor Code: I pledge that this program represents my own program code. 
// I received help from the book and notes in understanding and debugging my program. 

package library;
public class Book {
    
    // create strings outside method so it can be used by them all
    String title;
    boolean borrowed;

    public static void main(String[] arguments) {    
    }
    
    // creates book and assigns title
     public Book(String bookTitle) {
         title = bookTitle;
     } 

     // assigns true to the boolean variable
     public void borrowed() {
        borrowed = true;  
      }

     // assigns false to the boolean variable
     public void returned() {
        borrowed = false; 
     }

     // check to see if the book is borrowed
     public boolean isBorrowed() {
         if (borrowed)
             return true;
         else
             return false;
     }

     //  returns the title assigned to the book
     public String getTitle() {
         return title; 
      }      
}   