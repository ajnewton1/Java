//**************************************** 
// Project: Program 3 
// Class: CS 422
//
// Author: Aaron Newton 
//
// Completion time: 44 min
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from no one in designing and debugging my program.
//****************************************

package readabilitystatistics;

import java.io.*;
import java.util.Scanner;

public class ReadabilityDemo {
    public static void main(String[] args) throws FileNotFoundException {
        
        //legend
        System.out.println("                  Legend");
        System.out.println(" This program runs just like the Readability");
        System.out.println("  Statistics that is found in Microsoft Word");
        System.out.println(" All you have to do is just copy and paste the");
        System.out.println("file name and its entire location. Use this as an");
        System.out.println("  example: C:\\Users\\Aaron\\Desktop\\Test1.txt");
        System.out.println(" Once inputed, the program will then read it and");
        System.out.println("    print out the statistics of the document.");
        
        //scan file
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the specific file name: ");        
        Scanner inputFile = new Scanner(new FileReader(input.next()));
        inputFile.useDelimiter("\\Z");
        String stats = inputFile.next();
        inputFile.close();
        
        //print the methods
        ReadabilityStatistics rs = new ReadabilityStatistics();
        System.out.println("\nReadability Statistics");
        System.out.println("");
        System.out.println("Counts ----------------------------------");
        System.out.println("Words                                   " +rs.wordCount(stats));
        System.out.println("Characters                              " +rs.characterCount(stats));
        System.out.println("Paragraphs                              " +rs.paragraphCount(stats));
        System.out.println("Sentences                               " +rs.sentenceCount(stats));
        System.out.println("");
        System.out.println("Averages---------------------------------");
        System.out.println("Sentences per Paragraph                 " +rs.sentencesPerParagraph(stats));
        System.out.println("Words per Sentence                      " +rs.wordsPerSentences(stats));
        System.out.println("Characters per Word                     " +rs.charactersPerWord());
}
}