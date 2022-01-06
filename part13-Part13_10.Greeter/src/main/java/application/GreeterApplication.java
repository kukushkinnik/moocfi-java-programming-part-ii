package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        Label info = new Label("Enter your name and start");
        TextField textField = new TextField();
        Button enter = new Button("Start");


        GridPane layout = new GridPane();
        layout.add(info, 0,0);
        layout.add(textField, 0,1);
        layout.add(enter, 0, 2);

        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));


        Scene logIn = new Scene(layout);

        Label welcomeMessage = new Label();

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcomeMessage);
        welcomeLayout.setAlignment(Pos.CENTER);

        Scene welcomeView = new Scene(welcomeLayout);

        enter.setOnAction((event) -> {
            welcomeMessage.setText("Welcome " + textField.getText() +"!");
            window.setScene(welcomeView);
        });
        window.setScene(logIn);
        window.show();
    }


    public static void main(String[] args) {

        launch(GreeterApplication.class);
    }
}
