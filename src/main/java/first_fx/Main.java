package first_fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button;

    public static void main(String[] args) {
        launch(args); //will call launch from application to set up the program as a Java Fx application.
    }
    @Override
    //stage is the window.
    //the content inside the window is called the scene
    public void start(Stage stage) throws Exception{//this gets called once the launch method has been run.
        stage.setTitle("Hello");//sets the title of the window

        button = new Button(); //initialises a new button.
        button.setText("Click me");//sets the text on the button.

        StackPane layout = new StackPane(); //this is a preset simple layout.
        layout.getChildren().add(button); //this will set the button to be Centre as within the StackPane class it will automatically centre the button.

        Scene scene = new Scene(layout, 300, 250); //this creates a new instance of the scene class and sets it to be called scene. it then takes in the layout we have chosen and also the size.
        stage.setScene(scene);//this then sets the scene within the window.
        stage.show();//this will then show the window when it is run.
    }

}
