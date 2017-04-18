//***********************************************************************
// Project: Lab 2
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 2 hours
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
package lab2;

import java.util.Scanner;
import java.util.Arrays;

public class Lab2 {

    public static void main(String[] args) {
        
        // create the scanner object
        Scanner input = new Scanner(System.in);
        
        // create an array
        int list[] = new int[12];
        int searchItem;
        
        // user input
        System.out.println("Enter 12 integers.");
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        
        // prints array
        System.out.println("Origninal Data: " + (Arrays.toString(list)));
        
        //sorts array
        java.util.Arrays.sort(list);
        
        // prints sorted 
        System.out.println("Sorted data: " + (Arrays.toString(list)));
        
        // user input for search
         System.out.println("Enter Search item: ");
        searchItem = input.nextInt();
        
        System.out.println(searchItem + " was found at position " + binarySearch(list, list.length, searchItem));   
    }    
    
    // binary search method
    public static int binarySearch(int[] list, int listLenght, int searchItem){
        
        // variables
        int first = 0;
        int last = list.length-1;
        int mid = 0;
        boolean found = false;
        
        //search for searchItem
        while(first <= last &&! found){
            mid = (first + last)/2;
            if(list[mid] == searchItem)
                found = true;
            else if (list[mid] > searchItem)
                last = mid-1;
            else
                first = mid + 1;
        }
        
        // if searchItem is found
        if(found)
            return mid;
        else
            return -1;
        
    }
  
 ///////////////////////////////////////////////////////////////////////       
        class ArrayBub
{
   private long[] a; // ref to array a
   private int nElems; // number of data items
   //--------------------------------------------------------------
   public ArrayBub(int max) // constructor
   {
      a = new long[max]; // create the array
      nElems = 0; // no items yet
   }
   //--------------------------------------------------------------
   public void insert(long value) // put element into array
   {
      a[nElems] = value; // insert it
      nElems++; // increment size
   }
   //--------------------------------------------------------------
   public void bubbleSort()
   {
      int out, in;
      for(out=nElems-1; out>1; out--) // outer loop (backward)
      for(in=0; in<out; in++) // inner loop (forward)
      if( a[in] > a[in+1] ) // out of order?
      swap(in, in+1); // swap them
   } // end bubbleSort()
   //--------------------------------------------------------------
   private void swap(int one, int two)
   {
      long temp = a[one];
      a[one] = a[two];
      a[two] = temp;
   }
   //--------------------------------------------------------------
} // end class ArrayBub
////////////////////////////////////////////////////////////////


    }
    

