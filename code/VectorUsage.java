//*
// Account: ajn54@pitt.edu
// Author: Aaron Newton
// Completion Time: approx. 4hrs
// Honor Code: I pledge that this program represents my own program.
// I recieved help from no one in understanding and debugging my program.
package vectorusage;

import java.util.*;

public class VectorUsage {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
       
       // input scanner object
       Scanner input = new Scanner(System.in);
       
       // Print out title message
       System.out.println("Welcome to the Vector Manipulation Program!");
       System.out.println("\nCreating new Vectors");
       
       // create 2 seperate variables
       Vector a = new Vector();
       Vector b = new Vector();
       
      // Vector of initial capacity(size) of 0
      System.out.println("\nVector 1 is size "+ a.size() + " and contains:" + a);
      System.out.println("Vector 1 is size "+ b.size() + " and contains:" + b);
  
      // input 4 strings from user
      System.out.println("\nPlease enter 4 strings:");
      a.add(input.next());
      a.add(input.next());
      a.add(input.next());
      a.add(input.next());
      
      // input 4 more strings from user
      System.out.println("\nPlease enter 4 more strings:");
      b.add(input.next());
      b.add(input.next());
      b.add(input.next());
      b.add(input.next());

      // print out size and contain for both vectors
      System.out.println("\nVector 1 is size " + a.size() + " and contains:" + a);
      System.out.println("Vector 2 is size " + b.size() + " and contains:" + b);
       
      // user input integer
      System.out.println("\nPlease enter an integer:");
      int i = input.nextInt();
      
      // Print out element at index i for both vectors
      System.out.println("\nElement at index " + i + " in Vector 1 is: " + a.get(i));
      System.out.println("Element at index " + i + " in Vector 2 is: " + b.get(i));
        
      // Removing the element at index i for both vectors
      System.out.println("Removing the element at index " + i + " of both vectors");
      a.remove(i);
      b.remove(i);
      
      // Adding first element of Vector 1 to Vector 2
      System.out.println("Adding first element of Vector 1 to Vector 2.");
      String s = (String) a.firstElement();
      b.addElement(s);
      
      // Print out size and contain for both vectors
      System.out.println("\nVector 1 is size " + a.size() + " and contains:" + a);
      System.out.println("Vector 2 is size " + b.size() + " and contains:" + b);
      
      // Input another string from user
      System.out.println("\nPlease enter another String: ");
        String jump = input.next();
        
      // Search vector 1 for user input
      System.out.println("\nSearch Vector 1 for " + jump + " returned: " + (int) a.indexOf(jump));
      
      // First and last element of each string
      System.out.println("First element of Vector 1 is: " + a.firstElement());
      System.out.println("Last element of Vector 1 is: " + a.lastElement());
      System.out.println("Clear Vector 2");
        
      // clear 2nd vector
      b.clear();
      
      // Print out size and contain for both vectors
      System.out.println("\nVector 1 is size " + a.size() + " and contains:" + a);
      System.out.println("Vector 1 is size " + b.size() + " and contains:" + b);
      
      // Print out end message
     System.out.println("\nAll done!");
       
   }
}

