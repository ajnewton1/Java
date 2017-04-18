//**************************************** 
// Project: Program 4 
// Class: CS 422
//
// Author: Aaron Newton 
//
// Completion time: 
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from no one in designing and debugging my program.
//****************************************

public class StudentEmployee extends Employee{
    
    //Private instance variable fields
    private int hoursWorked;
    private boolean isWorkStudy;
    private double payRate;
    
    //Constructor - All args passed in as Strings
    public StudentEmployee(String name, String id, String isworking, String hours, String workStudy, String rate) {
        super(name, id, isworking);
        payRate = Double.parseDouble(rate);
        isWorkStudy = Boolean.parseBoolean(workStudy);
        hoursWorked = Integer.parseInt(hours);
    }
    
    public String toString() {
        return hoursWorked + "\t" + isWorkStudy + "\t" + payRate;
   }

    //Students are paid their hours worked times their pay rate (no overtime possible
    public double getPay() {
        return hoursWorked * payRate;
    }
}