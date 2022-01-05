package notifier;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        VBox componentGroup = new VBox();
        Button update = new Button("Update");
        TextField text = new TextField();
        Label label = new Label();

        componentGroup.getChildren().addAll(text,update,label);

        update.setOnAction((event) -> label.setText(text.getText()));

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
