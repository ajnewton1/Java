//***********************************************************************
// Project: Lab 1
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 2 hours
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
package lab1;

import java.util.Scanner;

public class Lab1 {
    
    public static void main(String[] args){
        
        // create the legend
        System.out.println("This is a sample test for The Sequential Ordered Search");
        System.out.println("For ease of use, This program will read 12 integers");
        System.out.println("all on 1 line. Display the input array");
        System.out.println("Call the Selection Sort. Enter 12 integers. Display");
        System.out.println("the sorted array and then search for an item.");
        
        // create the scanner object
        Scanner input = new Scanner(System.in);
        
        // have user input the list
        int list[] =  {4, 23, 65, 34, 84, 37, 12, 17, 24, 36, 82, 51};
        int i;
        for (i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println(" ");
        selectionSort(list, 12);
        for (i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
        System.out.println(list.length + " ");
    }
    
    // the selection sort method   
public static void selectionSort(int[] list, int listLenght){
    int index;
    int smallestIndex;
    int minIndex;
    int temp;
    for (index = 0; index < list.length - 1; index++){
        smallestIndex = index;
    for (minIndex = index + 1; minIndex < list.length; minIndex++)
        if (list[minIndex] < list[smallestIndex])
            smallestIndex = minIndex;
    temp = list[smallestIndex];
    list[smallestIndex] = list[index];
    list[index] = temp;          
}       
}
    // create the sequence ordered search method
    public static int seqOrderedSearch(int[] list, int listLenght, int searchItem){
        // scanner object
        Scanner scan = new Scanner (System.in);
        int loc;
        boolean found = false;
        for (loc = 0; loc < list.length; loc++)
            if (list[loc] >= searchItem)
            {
                found = true;
                break;
            }
        if (found)
            if (list[loc] == searchItem)
                return loc;
        else
                return -1;
        else
            return -1;        
    }   
}
