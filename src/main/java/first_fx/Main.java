package first_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window; //this names the stage to window.
    Scene scene1, scene2; //this names all the different scenes that will be used within the window.

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Label label1 = new Label("Welcome to scene 1"); //this is just a chunk of text that will be displayed within the scene.

        //Button 1
        Button button1 = new Button();
        button1.setText("Click here to change scene.");
        button1.setOnAction(e -> window.setScene(scene2));//this will change the scene to scene 2 when the button is clicked, by using a lambda expression.

        //Layout 1
        VBox layout1 = new VBox(20); //VBox will stack all the objects in that scene in vertical order, giving it a number will be the space between each object in pixels.
        layout1.getChildren().addAll(label1, button1);//this will add any objects in the parameters to the scene.
        scene1 = new Scene(layout1, 200, 200);

        //Button 2
        Button button2 = new Button("ALERT!");
        button2.setOnAction(e -> {
            boolean result = ConfirmationBox.display("Question", "Are You Sure?");
            System.out.println(result);
        });

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        //displays the first scene
        window.setScene(scene1);
        window.setTitle("Scene Switcher");
        window.show();//will display the window.
    }

}
