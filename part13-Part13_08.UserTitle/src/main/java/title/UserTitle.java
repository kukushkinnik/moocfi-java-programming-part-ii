package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {



    @Override
    public void start(Stage window) {
        Parameters parameters = getParameters();
        String title = parameters.getNamed().get("userTitle");

        window.setTitle(title);
        window.show();
    }


}
