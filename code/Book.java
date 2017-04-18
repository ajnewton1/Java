/*
 * 
 * 
 * 
 */
package book;

/**
 *
 * @author Aaron
 */
package Library {
public class Book {

String title;
boolean borrowed;
        // creates a new book
public Book (String bookTitle) {
            title = bookTitle;
            // Implement this method
        }
        public void borrowed() {
            borrowed = true;
            //Implement this metod
        }
        // returns true if the book is rented, false otherwise
        public void returned() {
            borrowed = false;
            //implement this method
        }
        //returns ture if the book is rented, false otherwise
        public boolean isBorrowed() {
            return borrowed;
            //implement this method
        }
        // returns the title of the book
        public String getTitle() {
            return title;
            //implement this method
        }
        public static void main(String[] arguments) {
            // small test of the book class
            Book example = new Book("The Da Vinci Code");
            System.out.println("Title: " + example.getTitle());
            System.out.println("Borrowed?: " + example.isBorrowed());
            example.borrowed();
            System.out.println("Borrowed?: " + example.isBorrowed());
            example.return();
            System.out.println("Borrowed?: " + example.isBorrowed()); 
        }
}
        
    
    

