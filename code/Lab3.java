//***********************************************************************
// Project: Lab3
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 2.5 hrs
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
import java.util.Scanner;

public class Lab3 {

   static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
    int[] inA = {4, 23, 65, 34, 82, 37, 12, 17, 24, 36, 82, 51};                             
    
    System.out.println();
    
    System.out.print( "ORIGINAL ARRAY");
    
   print (inA, inA.length);
    
     System.out.print("Enter a value to remove: ");
        int value = console.nextInt();
        System.out.println();
       
       remove (inA, inA.length, value);
       
       System.out.print("SMALLER ARRAY AFTER REMOVAL ");

       print (inA, inA.length - 1);
    }
    
   //This method will search for the value, then remove it from the array and reduce the size of it
    public static void remove(int[] list, int listLength, int removeItem) {
       int cInA = 0;                                                   
       int dupAc = 0;
       while (cInA < listLength)                                    
       {                                                               
           if (list[cInA] == removeItem)
               System.out.print("Removed " + list[cInA] + "\n\n");                               
           else {list[dupAc++]=list[cInA]; }   
           cInA++;                                                     
       }          

    }
    //PRINT Method
   public static void print(int[] list, int len)
  {  System.out.println(); System.out.println();
   for (int i = 0; i < len; i++)
    System.out.print(list[i] + " ");
   System.out.println();System.out.println();
  }  
    
 
}