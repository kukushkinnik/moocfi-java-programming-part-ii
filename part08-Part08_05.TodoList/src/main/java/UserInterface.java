import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            if(command.equals("stop")) {
                break;
            }

            if(command.equals("add")) {
                System.out.println("To add: ");
                String task = this.scanner.nextLine();
                this.list.add(task);
            }

            if(command.equals("remove")) {

                int taskNumber = Integer.parseInt(this.scanner.nextLine());
                this.list.remove(taskNumber);
            }

            if(command.equals("list")) {
                this.list.print();
            }

        }
    }
}
