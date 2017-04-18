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

public class DriverExam
    {
    
    //An array containing the correct answers
    private String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", 
        "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"}; 

    //Store the user's answers
    private String[] studentAnswers; 
    int[] missed = new int[correctAnswers.length]; 

    //Process the user's answers
    public DriverExam (String[] Answers)
    {
        studentAnswers = new String[Answers.length]; 
        for (int i = 0; i < Answers.length; i++)
        {
            studentAnswers[i] = Answers[i]; 
        }
    }

    //Returns a boolean value if correct answers >= 15 
    public boolean passed()
    {
        if (totalCorrect() >= 15)
            return true; 
        else
            return false; 
    }

    //Determines the total correct answers
    public int totalCorrect()
    {
        int correctCount = 0; 
        for (int i = 0; i < correctAnswers.length; i++)
        {
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i]))
            {
                correctCount++; 
            }
        }
        return correctCount; 
    }

    //Determines the total incorrect answers
    public int totalIncorrect()
    {
        int incorrectCount = 0; 
        for (int i = 0; i < correctAnswers.length; i++)
        {
            if (!studentAnswers[i].equalsIgnoreCase(correctAnswers[i]))
            {
                missed[incorrectCount] = i; 
                incorrectCount++; 
            }
        }
        return incorrectCount; 
    }

    //Missed questions
    public int[] questionsMissed()
    {
        return missed; 
    }
}
