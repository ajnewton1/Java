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

public class ClassifiedStaff extends Employee {
    
    //Private instance variable fields
    private double weeklySalary;
    private String division;
    
    //Constructor - All args passed in as Strings
    public ClassifiedStaff(String name, String id, String isworking, String salary, String div) {
        super(name, id, isworking);
        weeklySalary = Double.parseDouble(salary);
        division = div;
    }
    
    public String toString() {
        return weeklySalary + "\t" + division;
   }
    
    //Classified staff are paid double their weekly salary for the two-week pay period 
    public double getPay() {
        return 2*(weeklySalary);
    }
}