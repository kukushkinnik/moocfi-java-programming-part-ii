package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        BorderPane first = new BorderPane();
        Label firstText = new Label("First view!");
        first.setTop(firstText);
        Button firstButton = new Button("To the second view!");
        first.setCenter(firstButton);

        VBox second = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondText = new Label("Second view!");
        second.getChildren().addAll(secondButton, secondText);

        GridPane third = new GridPane();
        Label thirdText = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        third.add(thirdText,0,0);
        third.add(thirdButton,1,1);



        Scene firstWindow = new Scene(first);
        Scene secondWindow = new Scene(second);
        Scene thirdWindow = new Scene(third);

        firstButton.setOnAction((event) -> {
            window.setScene(secondWindow);
        });
        secondButton.setOnAction((event) -> window.setScene(thirdWindow));
        thirdButton.setOnAction((event) -> window.setScene(firstWindow));

        window.setScene(firstWindow);
        window.show();
    }

    public static void main(String[] args) {

        launch(MultipleViews.class);
    }

}
