package buttonandtextfield;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ButtonAndTextFieldApplication extends Application {
    @Override
    public void start(Stage window) {
        Button button = new Button("This is a button");
        TextField text = new TextField("Some text");
        FlowPane componentsGroup = new FlowPane();

        componentsGroup.getChildren().add(button);
        componentsGroup.getChildren().add(text);

        Scene view = new Scene(componentsGroup);
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);

    }

}
