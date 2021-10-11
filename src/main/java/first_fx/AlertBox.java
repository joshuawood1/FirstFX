package first_fx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class AlertBox {

    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);//this will block any input interaction with other windows relating to the program before they have dealt with the alert.
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        Button button1 = new Button("Close the Window!");
        button1.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button1);
        layout.setAlignment(Pos.CENTER);//sets everything to be aligned with the centre of the window.

        Scene scene = new Scene(layout, 200, 200);
        window.setScene(scene);
        window.showAndWait();//shows the stage and waits for it to be closed before returning to the main program.

    }
}
