//*
// Account: ajn54@pitt.edu
// Author: Aaron Newton
// Completion Time: a few hours
// Honor Code: I pledge that this program represents my own program.
// I recieved help from no one in understanding and debugging my program.

package bean.machine;

import java.util.*; 

public class BeanMachine { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
    //number of balls
    System.out.print("Enter the number of balls to drop: "); 
    int balls = input.nextInt(); 
    
    // number of slots
    System.out.print("Enter the number of slots in the bean machine: "); 
    int numSlots = input.nextInt(); 
    int slots[] = new int[numSlots+1]; 
    for (int i = 0; i < numSlots-1; i++) { 
      slots[path(numSlots)]++; 
    }  
  } 
 
  
// return slots and print path
  public static int path(int numSlots) {  
   int direction; 
    int right = 0; 
    for(int i = 1; i <= numSlots; i++) { 
        direction = (int)(Math.random() * 2); 
        if (direction == 0) 
            System.out.print("L"); 
        else 
            System.out.print("R"); 
            right++; 
     } 
        System.out.println(); 
    return right; 
  } 
   
} 
