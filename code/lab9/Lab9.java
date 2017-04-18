//***********************************************************************
// Project: Lab 9
// Class: CS 422
//
// Author: Aaron Newton
//
// Completion time: 50 min
//
// Honor Code: I pledge that this program represents my own program code.
// I received help from (no one) in designing and debugging my program.
//***********************************************************************
package lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Lab9 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // pane for images
        GridPane pane = new GridPane();
        
        // variable for card
        int card = 1;
        
        // get images and then arrange in pane
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 9; j++){
                pane.add(new ImageView(new Image("lab9/card/" + (card++) + ".png")), j, i);
            }
        }
        
        // scene
        Scene scene = new Scene(pane, 650, 580);
        primaryStage.setTitle("Card Deck");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
