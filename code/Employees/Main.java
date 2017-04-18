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


import java.io.*;
import java.util.Scanner;

public class Main {
    
    //Main method with arrays to hold values
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] workers = new String[11];
        String[] working = new String[11];
        String[] pay = new String[11];
        int o = 0;
        BufferedReader file = new BufferedReader(new FileReader("allemployees.csv"));
        String row = file.readLine(); 
        
        //Read input spreadsheet value
        while (row != null){
            workers = row.split(",");
            for (String item:workers) { 
                System.out.print(item + "\t"); 
                
            }
                System.out.println(); 
                row = file.readLine();
                if (Boolean.parseBoolean(workers[2]) == true){
                    working[o] = workers[0];
                    pay[o] = workers[3];
                    o++; }                 
          
            }
        file.close();
        System.out.println();
        System.out.println("Pay for two-week pay period");
        System.out.println("===========================");
        
        //Display output
        String indent = "                        ";
        for (int i = 0; i < working.length; i++) {
                String output = working[i];
                if (working[i] != null)
			System.out.print(output += indent.substring(0, indent.length() - working[i].length()));
                if (pay[i] != null)
			System.out.println("$" + pay[i]);
		}
        
        //Test code:
        // Employee a = new Employee("John Smith", "1122", "true");
        // StudentEmployee b = new StudentEmployee("Stan Stanley", "123456789", "TRUE", "19", "FALSE", "10.95");
        // ClassifiedStaff c = new ClassifiedStaff("Andrew Jackson", "122454111", "TRUE", "2250", "Business Services");
        // Faculty d = new Faculty("Jim Harper", "336699866", "FALSE", "63221", "36", "Math");
        // System.out.println(d.isWorking());
        

    }
    
}
