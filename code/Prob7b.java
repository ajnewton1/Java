//***********************************************************************
// Project: Program 7
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 352 min
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
package prob7b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.util.ArrayList;
import java.util.Arrays;

public class Prob7b extends Application {
    public static Stage stage;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        ConsecutiveFourPane pane;
        boolean isConsecutiveFour = false;
        do {
            pane = new ConsecutiveFourPane(new int[6][7]);
            isConsecutiveFour = pane.isConsecutiveFour();
        } while (!isConsecutiveFour);

        primaryStage.setScene(new Scene(pane));
        pane.btSolve.addEventHandler(EventType.ROOT, event -> {
           primaryStage.sizeToScene();
        });
        primaryStage.setTitle("Consecutive Four");
        primaryStage.show();
    }

    private class ConsecutiveFourPane extends BorderPane {

        // Creates array
        int m[][];
        StackPane[][] stackPanes;
        ArrayList<Integer> cFIndexes = new ArrayList<>(); // consecutive four indexes
        Label lblTitle = new Label("Click \"Solve\" to find solution");

        // Creates two buttons
        Button btSolve = new Button("Solve");
        Button btFile = new Button("FILE");

        private ConsecutiveFourPane(int[][] m) throws IOException {
            this.m = m;
            
            // Top Pane
            HBox hBox = new HBox(lblTitle);
            hBox.setAlignment(Pos.CENTER);
            hBox.setPadding(new Insets(5));
            setTop(hBox);

            // Creates and adds to center Pane
            stackPanes = new StackPane[m.length][m[0].length];
            GridPane gridPane = new GridPane();
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    Label label = new Label(" " + m[i][j] + " ");
                    label.setWrapText(false);
                    label.setFont(Font.font(20.0));
                    label.setWrapText(false);
                    stackPanes[i][j] = new StackPane(label);
                    stackPanes[i][j].setStyle("-fx-border-color: black;" +
                            "-fx-border-radius: 3");
                    gridPane.add(stackPanes[i][j], j, i);
                }
            }

            // Creates and adds to bottom Pane
            btSolve.setOnAction(e -> solve());
            btFile.setOnAction(e -> readFile());
            HBox bottomPane = new HBox(btSolve);
            bottomPane.getChildren().addAll(btFile);
            bottomPane.setAlignment(Pos.CENTER);
            bottomPane.setPadding(new Insets(5));
            setBottom(bottomPane);

            // Sets/formats gridPane
            gridPane.setHgap(0.5);
            gridPane.setVgap(0.5);
            gridPane.setAlignment(Pos.CENTER);
            gridPane.setPadding(new Insets(10));
            gridPane.setStyle("-fx-border-color: black");
            setMargin(gridPane, new Insets(20));
            setCenter(gridPane);
        }

        // Reads file chosen by user
        public void readFile() {
            FileChooser fileChooser = new FileChooser();
            try{
                fileChooser.setTitle("Select input File");
                File file = fileChooser.showOpenDialog(stage);
                java.util.Scanner input = new java.util.Scanner(System.in);
                BufferedReader br = new BufferedReader(new FileReader(file));
                int row = 0;
                int column = 0;
                String s = br.readLine();
                column = s.length()/2+1;
                while(s != null){
                    s = br.readLine();
                    row++;
                }
                m = new int[row][column];
                br = new BufferedReader(new FileReader(file));
                s = br.readLine();
                int i = 0;
                int j = 0;
                while(s != null){
                    j = 0;
                    for(Character ch: s.toCharArray()){
                        if(ch != ' '){
                            m[i][j] = ch - '0';
                            j++;
                        }
                    }
                    i++;
                    s = br.readLine();
                }
                ConsecutiveFourPane cfp = new ConsecutiveFourPane(m);
                stage.setScene(new Scene(cfp));
                
                // Action for btSolve
                cfp.btSolve.addEventHandler(EventType.ROOT, event ->{
                    stage.sizeToScene();
                });
                stage.setTitle("Consecutive Four");
                stage.show();
                System.out.println();
            }
            catch(Exception e){       
            }
        }
        
        // Checks if there is a consecutive four numbers, returns true or false
        private boolean solve() {
            boolean isSolved = isConsecutiveFour();

            if (isSolved) {
                lblTitle.setText("A Consecutive Four Found!");
                lblTitle.setTextFill(Color.BLUE);

                // Change consecutive four lbl background
                for (int k = 0; k < cFIndexes.size(); k += 2) {
                    int i = cFIndexes.get(k);
                    int j = cFIndexes.get(k + 1);
                    Label label = (Label) stackPanes[i][j].getChildren().get(0);
                    label.setStyle(
                            "-fx-border-color: blue;");
                }
            } 
            
            // Prints if there is no consecutive four
            else {
                lblTitle.setText("NO Consecutive Four Found!");
                lblTitle.setTextFill(Color.RED);
            }
            return isSolved;
        }

        // Searches array of numbers for consecutive four
        private boolean isConsecutiveFour() {
            
            // Checks rows for consecutive four numbers
            for (int i = 0; i < m.length; i++) {
                int current = m[i][0];

                for (int j = 0; j < m[i].length; j++) {
                    if (m[i][j] == current) {
                        cFIndexes.add(i);
                        cFIndexes.add(j);

                        if (cFIndexes.size() == 8) {
                            return true;
                        }
                    } 
                    else {
                        current = m[i][j];
                        cFIndexes.clear();
                        cFIndexes.add(i);
                        cFIndexes.add(j);
                    }
                }
                cFIndexes.clear();
            }

            // Checks columns for four consecutive numbers
            for (int j = 0; j < m[0].length; j++) {
                int current = m[0][j];
                
                for (int i = 0; i < m.length; i++) {
                    if (m[i][j] == current) {
                        cFIndexes.add(i);
                        cFIndexes.add(j);

                        if (cFIndexes.size() == 8) {
                            return true;
                        }
                    } 
                    else {
                        current = m[i][j];
                        cFIndexes.clear();
                        cFIndexes.add(i);
                        cFIndexes.add(j);
                    }
                }
                cFIndexes.clear();
            }
            
            // Checks topLeft side going up the right
            for (int i = m.length - 1; i > 0; i--) {
                int y = i;
                int x = 0;
                int current = m[y][x];

                while (y >= 0 && x < m[y].length) {
                    if (m[y][x] == current) {
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                        if (cFIndexes.size() == 8) {
                            return true;
                        }
                    } else {
                        current = m[y][x];
                        cFIndexes.clear();
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                    }
                    x++;
                    y--;
                }
                cFIndexes.clear();
            }
            
            // Checks bottom right side going up the right
            for (int j = 0; j < m[0].length; j++) {
                int y = m.length - 1;
                int x = j;
                int current = m[y][x];

                while (x < m[0].length && y >= 0) {
                    if (m[y][x] == current) {
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                        if (cFIndexes.size() == 8) {
                            return true;
                        }
                    } 
                    else {
                        current = m[y][x];
                        cFIndexes.clear();
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                    }
                    x++;
                    y--;
                }
                cFIndexes.clear();
            }
            
            // Checks bottom left side going up the left
            for (int j = m[0].length - 1; j > 0; j--) {
                int x = j;
                int y = m.length - 1;
                int current = m[y][x];

                while (x >= 0 && y >= 0) {
                    if (m[y][x] == current) {
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                        if (cFIndexes.size() == 8) {
                            return true;
                        }
                    } 
                    else {
                        current = m[y][x];
                        cFIndexes.clear();
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                    }

                    x--;
                    y--;
                }
                cFIndexes.clear();
            }
            
            // Checks bottom right side going up the left
            for (int row = 1 ; row < m.length; row++) {
                int x = m[0].length - 1;
                int y = row;
                int current = m[y][x];

                while (y >= 0 && x >= 0) {
                    if (m[y][x] == current) {
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                        if (cFIndexes.size() == 8) {
                            return true;
                        }
                    } else {
                        current = m[y][x];
                        cFIndexes.clear();
                        cFIndexes.add(y);
                        cFIndexes.add(x);
                    }
                    x--;
                    y--;
                }
                cFIndexes.clear();
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Application.launch(args);
        
        // Legend 
        System.out.println("This program is designed to search for four consecutive");        
        System.out.println("integers in a GUI program. The GUI is designed to display all");
        System.out.println("0's first then when the file button is pushed, a txt file can");
        System.out.println("be selected to fill the text fields in the GUI. The solve button");
        System.out.println("searches for four consecutive integers and highlights them if there");
        System.out.println("are four consecutive integers.");
        System.out.println();
    }
}