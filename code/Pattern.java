
package newton.p7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pattern extends Application {
    
    // Create and initialize cell
    private final Cell[][] cell =  new Cell[6][7];

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Pane to hold cell
        GridPane pane = new GridPane(); 
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                pane.add(cell[i][j] = new Cell(), j, i);

        BorderPane borderPane = new BorderPane();
        
        Text found = new Text("          A consecutive four found");
        found.setFont(new Font(10));
        
        Text left = new Text("   ");
        
        Button btn = new Button("Solve");
        
        VBox sp = new VBox();
        sp.getChildren().addAll(found, pane, btn);
        borderPane.setCenter(sp);
        
        Text t = new Text("2");
        
        
        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 235, 225);
        primaryStage.setTitle("The Final Adventure"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage   
    }

    // An inner class for a cell
    public class Cell extends Pane {
    // Token used for this cell
    private char token = ' ';

    public Cell() {
      setStyle("-fx-border-color: black"); 
      this.setPrefSize(2000, 2000);
      this.setOnMouseClicked(e -> handleMouseClick());
    }

    /** Return token
       * @return  */
    public char getToken() {
      return token;
    }

    /** Set a new token
       * @param c */
    public void setToken(char c) {
      token = c;
      
      if (token == 'X') {
        Line line1 = new Line(10, 10, 
          this.getWidth() - 10, this.getHeight() - 10);
        line1.endXProperty().bind(this.widthProperty().subtract(10));
        line1.endYProperty().bind(this.heightProperty().subtract(10));
        Line line2 = new Line(10, this.getHeight() - 10, 
          this.getWidth() - 10, 10);
        line2.startYProperty().bind(
          this.heightProperty().subtract(10));
        line2.endXProperty().bind(this.widthProperty().subtract(10));
        
        // Add the lines to the pane
        this.getChildren().addAll(line1, line2); 
      }
}  

        private void handleMouseClick() {
            if (token == ' ') {
        setToken(token); // Set token in the cell
        }
    }
}}