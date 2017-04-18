//***********************************************************************
// Project: Program 7
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 164 min
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
package prob7a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Prob7a {

    public static void main(String[] args) throws IOException {
      
    /*    int[][] board = {
        {0, 1, 0, 6, 1, 6, 1},
        {0, 1, 6, 8, 6, 0, 1},
        {5, 2, 2, 1, 8, 2, 9},
        {6, 5, 6, 1, 1, 2, 1},
        {6, 9, 6, 2, 1, 9, 1},
        {3, 5, 9, 1, 3, 1, 1},
        {6, 5, 6, 3, 1, 9, 3},
        {1, 3, 6, 1, 9, 0, 7}    
    }; */
    
        // Legend 
        System.out.println("This program is designed to search for four consecutive");        
        System.out.println("integers. The array is filled");
        System.out.println("with integers from a file. The array is displayed, and the");
        System.out.println("true or false is diaplyed depending on if there is consecutive");
        System.out.println("four integers in the array.");
        System.out.println();
  
        // Reads file specified  
        File f = new File("test1.txt");
        BufferedReader br = new BufferedReader(new FileReader(f));
        int row = 0;
        int column = 0;
        String s = br.readLine();
        column = s.length()/2+1;
        while(s != null){
            s = br.readLine();
            row++;
        }
    
         // Creates array and fills it with the contents of the file
        int[][] board = new int[row][column];
        br = new BufferedReader(new FileReader(f));
        s = br.readLine();
        int i = 0;
        int j = 0;
        while(s != null){
            j =0;
            for(Character ch: s.toCharArray()){
                if(ch != ' '){
                    board[i][j] = ch - '0';
                    j++;
                }
            }
            i++;
            s = br.readLine();
        }

        System.out.println(Arrays.deepToString(board));
        System.out.println(isConsecutiveFour(board));
        System.out.println();
    }

    public static boolean isConsecutiveFour(int[][] values) {
        int numberOfRows = values.length;
        int numberOfColumns = values[0].length;

        // Check rows
        for (int i = 0; i < numberOfRows; i++) {
            if (isConsecutiveFour(values[i]))
            return true;
        }

        // Check columns
        for (int j = 0; j < numberOfColumns; j++) {
            int[] column = new int[numberOfRows];
        
            // Get a column into an array
            for (int i = 0; i < numberOfRows; i++)
                column[i] = values[i][j];
                if (isConsecutiveFour(column))
                return true;
        }
        
        // Check major diagonal (lower part)   
        for (int i = 0; i < numberOfRows - 3; i++) {
            int numberOfElementsInDiagonal 
                = Math.min(numberOfRows - i, numberOfColumns);     
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int k = 0; k < numberOfElementsInDiagonal; k++)
                diagonal[k] = values[k + i][k];
      
            if (isConsecutiveFour(diagonal))
                return true;
        }
    
        // Check major diagonal (upper part)
        for (int j = 1; j < numberOfColumns - 3; j++) {
            int numberOfElementsInDiagonal 
                = Math.min(numberOfColumns - j, numberOfRows);     
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int k = 0; k < numberOfElementsInDiagonal; k++)
                diagonal[k] = values[k][k + j];
      
            if (isConsecutiveFour(diagonal))
                return true;
        }

        // Check sub-diagonal (left part)
        for (int j = 3; j < numberOfColumns; j++) {
            int numberOfElementsInDiagonal 
                = Math.min(j + 1, numberOfRows);     
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int k = 0; k < numberOfElementsInDiagonal; k++)
                diagonal[k] = values[k][j - k];
      
            if (isConsecutiveFour(diagonal))
                return true;
        }
    
        // Check sub-diagonal (right part)
        for (int i = 1; i < numberOfRows - 3; i++) {
            int numberOfElementsInDiagonal 
                = Math.min(numberOfRows - i, numberOfColumns);     
            int[] diagonal = new int[numberOfElementsInDiagonal];
            for (int k = 0; k < numberOfElementsInDiagonal; k++)
                diagonal[k] = values[k + i][numberOfColumns - k - 1];
    
            if (isConsecutiveFour(diagonal))
                return true;
        }   
    return false; 
  }
  
    // Checks int values for consecutive four
    public static boolean isConsecutiveFour(int[] values) {    
        for (int i = 0; i < values.length - 3; i++) {
        boolean isEqual = true;        
        for (int j = i; j < i + 3; j++) {
            if (values[j] != values[j + 1]) {
            isEqual = false;
            break;
            }
        }     
        if (isEqual) return true;
        }    
        return false;
    }
}