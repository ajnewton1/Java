//**************************************** 
// Project: LAB 8 
// Class: CS 422
//
// Author: Aaron Newton 
//
// Completion time: 84 min
//
// Honor Code: I pledge that this program represents my own program code. 
// I received help from no one in designing and debugging my program.
//****************************************

package rectanguloid;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;

public class Rectanguloid extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Create a pan
        Pane pane = new Pane();
        double paneWidth = 200;
        double paneHeight = 200;
        double width = 70;
        double height = 60;
        
        // Create 2 rectangles and add to pane
        Rectangle r1 = new Rectangle(105, 40, width, height);
        r1.widthProperty().bind(pane.widthProperty().divide(2));
        r1.heightProperty().bind(pane.heightProperty().divide(2));
        r1.setStroke(Color.RED);
        r1.setFill(null);
        pane.getChildren().add(r1);
         
        Rectangle r2 = new Rectangle(100, 50, width, height);
        r2.widthProperty().bind(pane.widthProperty().divide(2));
        r2.heightProperty().bind(pane.heightProperty().divide(2));
        r2.setStroke(Color.BLUE);
        r2.setFill(null);
        pane.getChildren().add(r2);
        
        // Create 4 lines
        Line l1 = new Line(105, 40, 100, 50);
        l1.setStrokeWidth(1);
        l1.setStroke(Color.GREEN);
        pane.getChildren().add(l1);
        
        Line l2 = new Line((width + 105), 40, (width + 100), 50);
        l2.startXProperty().bind(r1.widthProperty().add(105));
        l2.endXProperty().bind(r2.widthProperty().add(100));
        l2.setStrokeWidth(1);
        l2.setStroke(Color.GREEN);
        pane.getChildren().add(l2);
        
        Line l3 = new Line(105, (height + 40), 100, (height + 50));
        l3.startYProperty().bind(r1.heightProperty().add(40));
        l3.endYProperty().bind(r2.heightProperty().add(50));
        l3.setStrokeWidth(1);
        l3.setStroke(Color.GREEN);
        pane.getChildren().add(l3);
        
        Line l4 = new Line((width + 105), (height + 40), (width + 100), (height + 50));
        l4.startXProperty().bind(r1.widthProperty().add(105));
        l4.startYProperty().bind(r1.heightProperty().add(40));
        l4.endXProperty().bind(r2.widthProperty().add(100));
        l4.endYProperty().bind(r2.heightProperty().add(50));
        l4.setStrokeWidth(1);
        l4.setStroke(Color.GREEN);
        pane.getChildren().add(l4);
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 250, 150);
        primaryStage.setTitle("Rectanguloid");
        primaryStage.setScene(scene);
        primaryStage.show(); 
        
    }    
}
