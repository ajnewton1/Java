// Account: ajn54
// Author: Aaron Newton
// Completion time: 2 days
// Honor Code: I pledge that this program represents my own program code. 
// I received help from the book and notes in understanding and debugging my program. 

package library;
import java.util.*;
import java.io.*;
public class Test{
    public static void main(String args[]) throws FileNotFoundException {
        
        // create the legend 
        System.out.println("This project is like a library.");
        System.out.println(" The four libraries are created.");
        System.out.println("They will be filled in with books from an imported file");
        System.out.println("When asked, input a file name and its full location.");
        System.out.println("ex: (C:\\Users\\Aaron\\Documents\\Java\\Library\\src\\library\\book.txt)");
        System.out.println("Choose the library.");
        System.out.println("You can print a library inventory.");
        System.out.println("Then, decide if you'd like to borrow/return a book");        
        System.out.println("When it ends, it will list the borrowed books and libraries.");
        System.out.println("Oh and also, book titles are case sensitive.");
        System.out.println("Have fun!");
        System.out.println();

        // create the scanners
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the specific file name: ");        
        Scanner input2 = new Scanner(new FileReader(input.next()));

        // create the four libraries
        Library firstLibrary = new Library("1 April St.");
        Library secondLibrary = new Library("2 May Drive");
        Library thirdLibrary = new Library("1 Finoli Drive");
        Library fourthLibrary = new Library("2080 Robin Hood Dr.");

        // import the text file and fill the libraries
        while (input2.hasNext()) {
            for (int b = 0; b < 100; b++)
            if (b < 25) {
                firstLibrary.addBook(new Book(input2.nextLine()));
            }
            else if (b < 50) {
                secondLibrary.addBook(new Book(input2.nextLine()));
            }
            else if (b < 75) {
                thirdLibrary.addBook(new Book(input2.nextLine()));
            }
            else {
                fourthLibrary.addBook(new Book(input2.nextLine()));
            }
        }
        
        // contains books that are borrowed
        Vector borrowed = new Vector();

        //choose the library the user would like to search and print inventory        
        do {
            System.out.println("Choose one of the libraries (first, second, third, or fourth)");
            String library = input.next();
            if (library.equals("first")) {
                System.out.println("Would you like me to print a library inventory (yes or no)?");
                String answer = input.next();
                if (answer.equals("yes")) {
                    firstLibrary.printAvailableBooks();
                }
                
                // ask the user what he would like to do in the library
                System.out.println("Would you like to borrow, return, or neither?");
                String action = input.next();
                if (action.equals("borrow")) {
                    System.out.println("Enter a book title: ");
                    String title = scan.nextLine();
                    firstLibrary.borrowBook(title);
                    borrowed.add(title + " from the first library");
                }

                //  When the book is returned, it is removed from the borrowed vector
                else if (action.equals("return")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    firstLibrary.returnBook(title);
                    borrowed.remove(title + " from the first library");
                }
            }
            
            // do the same as the 1st library but to the second library
            else if (library.equals("second")) {
                System.out.println("Would you like me to print a library inventory (yes or no)?");
                String answer = input.next();
                if (answer.equals("yes")) {
                    secondLibrary.printAvailableBooks();
                }
                System.out.println("Would you like to borrow, return, or neither?");
                String action = input.next();
                if (action.equals("borrow")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    secondLibrary.borrowBook(title);
                    borrowed.add(title + " from the second library");
                }
                else if (action.equals("return")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    secondLibrary.returnBook(title);
                    borrowed.remove(title + " from the second library");
                }
            }
            
            // do the same actions for the third library
            else if (library.equals("third")) {
                System.out.println("Would you like me to print a library inventory (yes or no)?");
                String answer = input.next();
                if (answer.equals("yes")) {
                    thirdLibrary.printAvailableBooks();
                }
                System.out.println("Would you like to borrow, return, or neither?");
                String action = input.next();
                if (action.equals("borrow")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    thirdLibrary.borrowBook(title);
                    borrowed.add(title + " from the third library");
                }
                else if (action.equals("return")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    thirdLibrary.returnBook(title);
                    borrowed.remove(title + " from the third library");
                }
            }
            
            // do the same actions for the fourth library
            else if (library.equals("fourth")) {
                System.out.println("Would you like me to print a library inventory (yes or no)?");
                String answer = input.next();
                if (answer.equals("yes")) {
                    fourthLibrary.printAvailableBooks();
                }
                System.out.println("Would you like to borrow, return, or neither?");
                String action = input.next();
                if (action.equals("borrow")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    fourthLibrary.borrowBook(title);
                    borrowed.add(title + " from the fourth library");
                }
                else if (action.equals("return")) {
                    System.out.println("Enter a book title:");
                    String title = scan.nextLine();
                    fourthLibrary.returnBook(title);
                    borrowed.remove(title + " from the fourth library");
                }
            }
            
            // ask the user if he would like to search another library
           System.out.println("Would you like me to search another library for the book (yes or no)?");
        } while (input.next().equals("yes"));
             
        // print the borrowed books or none
        System.out.println("The books that are currently borrowed are:");
        if (borrowed.size() == 0) {
            System.out.println("None");
        }
        else {
        for (int t = 0; t < borrowed.size(); t++) {
            System.out.println(borrowed.elementAt(t));
        }
        }
    }    
}
