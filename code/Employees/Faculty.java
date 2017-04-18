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

public class Faculty extends Employee {
    
    //Private instance variable fields
    private double annualSalary;
    private int weeksPerYear;
    private String department;
    
    //Constructor - All args passed in as Strings
    public Faculty(String name, String id, String isworking, String salary, String weeks, String dept) {
        super(name, id, isworking);
        annualSalary = Double.parseDouble(salary);
        weeksPerYear = Integer.parseInt(weeks);
        department = dept;
    }
    
    public String toString() {
        return annualSalary + "\t" + weeksPerYear + "\t" + department;
   }
    
    //Faculty are paid double their annual salary divided by the number of weeks per year they work (per two-week pay period) 
    public double getPay() {
        return (2*annualSalary)/weeksPerYear;
    }
    
}