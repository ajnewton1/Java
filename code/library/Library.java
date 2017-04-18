// Account: ajn54
// Author: Aaron
// Completion time: 1 day
// Honor Code: I pledge that this program represents my own program code. 
// I received help from the book and notes in understanding and debugging my program.

package library;
public class Library {
    public static void main(String[] args) {   
    }
    
    // add the string
    String address;
    Book[] library = new Book[0];

    // creates library and assign adddress
    public Library(String libraryAddress) {
        address = libraryAddress;
    }

    // creates array with the new books in it
    public void addBook(Book bookTitle) {
        Book[] shelves = new Book[library.length + 1];
        for (int b = 0; b < library.length; b++) {
            shelves[b] = library[b];
        }
        shelves[library.length] = bookTitle;
        library = shelves;
    }

    // all libraries have the same hours
    public static void printOpeningHours() {
        System.out.println("Libraries are open from 9am to 5pm everyday.");
    }

    // prints assigned address to the library
    public void printAddress() {
        System.out.println(address);
    }

    //borrows books from libraries, check to see if in, see if borrowed
    public void borrowBook(String bookTitle) {
        int t = 0; 
        for (int i = 0; i < library.length; i++){ 
             if (library[i].getTitle().equals(bookTitle)){ 
                 if (library[i].isBorrowed()){ 
                     System.out.println("Sorry, but this book is already borrowed.");
                     t += 1;
                 } 
             
                 // borrows book if still in library
                 else { 
                     library[i].borrowed(); 
                     System.out.println("You borrowed " + bookTitle);
                     t += 1;
                 } 
             }
         }
         if (t == 0) {
             System.out.println("Sorry, but this book is not in our catalog.");
         }
     }

    // searches library, prints out title of book(If empty then it says no book in catalog)
    public void printAvailableBooks() {
        boolean empty = true; 
        for (int i = 0; i < library.length; i++){ 
            if (!(library[i].isBorrowed())){ 
                System.out.println(library[i].getTitle()); 
                empty = false; 
            } 
        } 
        if (empty){ 
            System.out.println("No book in catalog"); 
        } 

    }

    // same as borrowBook but it returns the books
    public void returnBook(String bookTitle) {
        int t = 0; 
        for (int i = 0; i < library.length; i++){ 
             if (library[i].getTitle().equals(bookTitle)){ 
                 if (library[i].isBorrowed()){ 
                     System.out.println("You returned " + bookTitle); 
                     library[i].returned();
                     t += 1;
                 } 
             }
        }
        if (t == 0) {
                System.out.println("Sorry,but this book is not in our catalog.");
             }
    }
    }