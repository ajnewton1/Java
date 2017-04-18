//*********************************************************************** 
// Project: Program 1 
// Class: CS 422 
//
// Author: Aaron Newton
//
// Completion time: 5-6 hours 
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from (no one) in designing and debugging my program. 
//*********************************************************************** 

package rainfall;


import java.util.Scanner;

public class RainFall {
                
    // create the legend
    public void printLegend() {
        System.out.println("                             Legend              ");
        System.out.println("This program calculates and displays the correct total rainfall, ");
        System.out.println("       average rainfall per month, month with the most rain,  ");
        System.out.println("               and the month with the least rain.");
        System.out.println(" ");
    }
    
    // create array for the months
    private String[] monthNames = {"January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"};
    
    // create two arrays for rainfall data
    private double[] d1 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10, 11.11, 12.12};
    private double[] d2 = {6.5, 5.3, 4.2, 3.1, 2.0, 1.9, 12.9, 11.8, 10.7, 9.6, 8.7, 7.6}; 

    // method to declare the total amount of rainfall for d1
    public double getTotalD1() {
        double total = 0;
        for (int i = 0; i < monthNames.length; i++) {
            total = total + d1[i];
        }
        return total;
     }
    
    // method to declare the total amount of rainfall per d2
    public double getTotalD2() {
        double total = 0;
        for (int i = 0; i < monthNames.length; i++) {
            total = total + d2[i];
        }
        return total;
     }

    // method to declare the average rainfall per month for d1
    public double getAverageD1() {
        return getTotalD1() / monthNames.length;
     }
      
    // method to declare the average rainfall per month for d2
    public double getAverageD2() {
        return getTotalD2() / monthNames.length;
     }
    
    // method to declare the month with the highest rainfall for d1
    public int getHighestMonthD1() {
        double largest = d1[0];
        int m = 0;
        for (int i = 0; i < monthNames.length; i++) {
            if (d1[i] > largest) {
                m = i;
            }
        }
        return m + 1;
    }
    
    // method to declare the month with the highest rainfall for d2
    public int getHighestMonthD2() {
        double largest = d2[0];
        int m = 0;
        for (int i = 0; i < monthNames.length; i++) {
            if (d2[i] > largest) {
                m = i;
            }
        }
        return m + 1;
    }
     
    // method to declare the month with the lowest rainfall for d1
    public int getLowestMonthD1() {
        double smallest = d1[0];
        int m = 0;
        for (int i = 0; i < monthNames.length; i++) {
            if (d1[i] < smallest)
                m = i;
        }
        return m + 1;
    }
    
    // method to declare the month with the lowest rainfall for d2
    public int getLowestMonthD2() {
        double smallest = d2[0];
        int m = 0;
        for (int i = 0; i < monthNames.length; i++) {
            if (d2[i] < smallest)
                m = i;
        }
        return m + 1;
    }

    // printing out the results for each method
    public static void main(String[] args) {
        
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    RainFall rf = new RainFall();
    rf.printLegend();
    System.out.println("The total rainfall for the year is " + rf.getTotalD1());
    System.out.println("The average rainfall for the months is " + rf.getAverageD1());
    System.out.println("The month with most amount of rain is " + rf.getHighestMonthD1());
    System.out.println("The month with least amount of rain is " + rf.getLowestMonthD1());
    
    // ask the user if he would like to see the results from d2
    System.out.print("\nWould you like to see the results from d2? (yes/no) ");
        String a = input.next();
 
        // if user answers "yes" then print out results from d2
        if ("yes".equals(a)) {
            System.out.println("\nThe total rainfall for the year is " + rf.getTotalD2());
            System.out.println("The average rainfall for the months is " + rf.getAverageD2());
            System.out.println("The month with most amount of rain is " + rf.getHighestMonthD2());
            System.out.println("The month with least amount of rain is " + rf.getLowestMonthD2());
        }
        
        // if user answers no end the program
        if ("no".equals(a)) {
            System.out.println("");
        }
    
    }
}
    
