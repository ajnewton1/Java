//**************************************** 
// Project: Program 5
// Class: CS 422
//
// Author: Aaron Newton 
//
// Completion time: 
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from no one in designing and debugging my program.
//****************************************

public class Month {
    
    private int monthNumber;
    private String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", 
        "August", "september", "October", "November", "December"};

    public Month(int m) {
        if(m <= 12){
            System.out.println("Month Number is" + m);
        }
        else {
            throw new IllegalArgumentException("Illegal Month Number" + m);
        } 
    }
    
    public Month(String[] monthNames) {
        // constructor
    }
    
    public void setMonthNumber(int monthNumber) {
        if(monthNumber <= 12){
            System.out.println("Month Number is" + monthNumber);
        }
        else {
            throw new IllegalArgumentException("Illegal Month Number" + monthNumber);
        }
    }
    
    public void setMonthNames(String [] monthNames) {
        // accepts string argument
    }
    
    public int getMonthNumber() {
        return 0;  
    }
    
    public String getMonthName() {
        return null;  
    }
    
    public String toString() {
        return null; 
    }
    
    public boolean equals(String [] monthNames) {
        return false;
    }
    
    public Month next() {
        return null;
    }
    
    public Month previous() {
        return null; 
    }
            
}