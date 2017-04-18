//***********************************************************************
// Project: Lab2_2
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 2.5 hrs
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
package Lab2_2;

import java.util.Scanner;

public class Lab2_2 {

static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args)  {
        
        // Legend
        System.out.println("This program uses the removeAt method to ");
        System.out.println("remove the element at an index provided by the ");
        System.out.println("user");
        
        // Create the array    
        int[] inA = {4, 13, 25, 28, 28, 28, 28, 28, 30, 43, 47, 54, 66, 82, 91}; 
    
        System.out.println();
    
        // Print array
        System.out.print( "ORIGINAL ARRAY");
        print (inA, inA.length);


        System.out.print("Enter an INDEX ( NOT VALUE ) to remove: ");
            int index = console.nextInt();
            System.out.println();
       
        // removeAt method
        removeAt(inA, inA.length, index);
       
        // Is index valid?
        if (index > inA.length -1 || index < 0){
            System.out.println("Index out of bounds");
            return;
        } 
        else if (inA.length == 0)
            System.out.println("Array is empty.");
    
        // Print out array after removal of index item   
        System.out.print("SMALLER ARRAY AFTER REMOVAL ");    
        print (inA, inA.length-1);
    }
    
    // Method to remove element at specified index 
    public static int removeAt(int[] list, int listLength, int index){
        for (int i = index; i < list.length - 1; i++){
            list[i] = list [i +1];  
        }       
        return list.length; 
    }
   
    //PRINT Method
    public static void print(int[] list, int len){  
        System.out.println(); System.out.println();
    for (int i = 0; i < len; i++)
        System.out.print(list[i] + " ");
    System.out.println();System.out.println();
    }  
    
 
}

