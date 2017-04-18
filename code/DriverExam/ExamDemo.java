//**************************************** 
// Project: Program 2 
// Class: CS 422
//
// Author: Aaron Newton 
//
// Completion time: 7 hours
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from no one in designing and debugging my program.
//****************************************

// driver

import java.util.Scanner; 

public class ExamDemo
{
    public static void main(String[] args)
    {
        // legend
        Scanner input = new Scanner(System.in);
        System.out.println("      Driver's License Exam "); 
        System.out.println("   20 Multiple-Choice Questions "); 
        System.out.println("         Mark A, B, C, D   "); 
        System.out.println("You must get 15 answers correct to pass");
        System.out.println("           Good Luck!");

        //Inputting string
        String[] answers = new String[20]; 
        String answer; 
        for (int i = 0; i < 20; i++) {
            do {
                System.out.print((i+1) + ": "); 
                answer = input.nextLine(); 
            } 
            while (!validAnswer(answer)); 
            answers[i] = answer; 
        }

        //Print out the methods 
        DriverExam e = new DriverExam(answers); 
        System.out.println("Number Correct = " + e.totalCorrect()); 
        System.out.println("Number Incorrect = " + e.totalIncorrect()); 

        //Result pass or fail and then prints out questions missed
        String passed = e.passed() ? "All questions answered correctly" : "Sorry, you failed"; 
        System.out.println(passed); 
        if (e.totalIncorrect() > 0) {
            System.out.println("You missed questions "); 
            int missedIndex; 
            for (int i = 0; i < e.totalIncorrect(); i++) {
                missedIndex = e.questionsMissed()[i]+1; 
                System.out.print(" " + missedIndex); 
            }
        }
        System.out.println(" ");
    } 

    //Returns true when answer is valid
    public static boolean validAnswer (String answer)
    {
        return "A".equalsIgnoreCase(answer) || "B".equalsIgnoreCase(answer) || "C".equalsIgnoreCase(answer) || "D".equalsIgnoreCase(answer); 
    }
} 