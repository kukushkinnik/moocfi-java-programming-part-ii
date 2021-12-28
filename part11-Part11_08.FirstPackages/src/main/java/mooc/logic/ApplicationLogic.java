package mooc.logic;

import mooc.ui.UserInterface;



public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;

    }

    public void execute(int times) {
        int counter = 0;
        while(counter < times) {
            System.out.println("Application logic is working");
            this.ui.update();
            counter++;
        }
    }
}
