//***********************************************************************
// Project: Lab2_1
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 3 hours total
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************

//Lab1: Programming Exercise 2
// This shows the non ArrayBub Bubble sort routine
//Data 4 23 65 34 84 37 12 17 24 36 82 51 (Read with Scanner)

import java.util.*;

public class Lab2_1
{
    static Scanner console = new Scanner(System.in);

    public void main(String[] args)
    {
      
      // YOU Have to construct an ArrayBub array & FILL IT using ArrayBub METHODS
        
        ArrayBub x = new ArrayBub(12);
        
        int[] list = new int[12];
        
        int[] x = new int[12];

        int index;

        int item;

        System.out.println("Enter 12 integers.");

        for (int i = 0; i < 12; i++){
         a.insert(console.nextInt());
	 x[i] = (int) a.getElement(i);
	}

	a.bubbleSort();

	for (int i = 0; i<12; i++)
	x[i] = (int) a.getElement(i);

        print (list,12);  /// SHOW THE ORIGINAL ARRAY INPUT

        x = bubbleSort(list,12); //  This reference must be replaced to use the ArrayBub sort 
                                 // & you need a public return method in ArrayBub to search since array private in ArrayBub
        
        print (x,12);  /// SHOW THE Sorted ARRAY 

        System.out.print("Enter the search item: ");
        item = console.nextInt();
        System.out.println();

        index = binarySearch(x, 12, item);

        if (index != -1)
            System.out.println(item + " is found at position " + index);
            else
            System.out.println(item + " is not in the list.");
            
    } // END OF DRIVER

    public static int binarySearch(int[] list, int listLength,
                                   int searchItem)
    {
        int first = 0;
        int last = listLength - 1;
        int mid = 0;

        boolean found = false;

        while (first <= last && !found)
        {
            mid = (first + last) / 2;

            if (list[mid] == searchItem)
                found = true;
            else if (list[mid] > searchItem)
                last = mid - 1;
            else
                first = mid + 1;
        }

        if (found)
            return mid;
        else
            return -1;
    }//end binarySearch
    
       
    public static void print(int[] list, int len)
    {
        for (int i = 0; i < len; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

  /// THIS METHOD NEEDS TO BE REPLACED WITH ArrayBub Class
    
  ////////////////////////////////////////////////////////////////
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
    //--------------------------------------------------------------
   
   {
   // PLUS you need to add a public method here to return a's data to use outside class since a is private
   
  
   }
} // end class ArrayBub
////////////////////////////////////////////////////////////////
   
   

}
