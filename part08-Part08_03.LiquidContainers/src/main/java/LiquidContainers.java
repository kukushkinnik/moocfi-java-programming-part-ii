import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        int max = 100;

        while (true) {
            System.out.println("First: " + firstContainer + '/' + max);
            System.out.println("Second: " + secondContainer + '/' + max);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] splittedInput = input.split(" ");
            String command = splittedInput[0];
            int amountOfLiquied = Integer.parseInt(splittedInput[1]);

            if (command.equals("add")) {
                if (firstContainer + amountOfLiquied < max && amountOfLiquied > 0) {
                    firstContainer += amountOfLiquied;
                } else if (firstContainer + amountOfLiquied > max) {
                    firstContainer = max;
                }
            }
            if (command.equals("move")) {
                if (firstContainer - amountOfLiquied > 0 && amountOfLiquied > 0 && firstContainer != 0) {
                    firstContainer -= amountOfLiquied;
                    if (secondContainer + amountOfLiquied > max) {
                        secondContainer = max;
                    } else {
                        secondContainer += amountOfLiquied;
                    }
                } else if (firstContainer - amountOfLiquied < 0 && amountOfLiquied > 0 && firstContainer != 0) {
                    if (secondContainer + firstContainer > max) {
                        secondContainer = max;
                    } else {
                        secondContainer += firstContainer;
                    }
                    firstContainer = 0;
                } else if (firstContainer - amountOfLiquied == 0 && firstContainer > 0 && firstContainer != 0) {
                    if (secondContainer + amountOfLiquied > max) {
                        secondContainer = max;
                    } else {
                        secondContainer += amountOfLiquied;
                    }
                }
            }

            if (command.equals("remove")) {
                if (secondContainer - amountOfLiquied >= 0 && amountOfLiquied > 0) {
                    secondContainer -= amountOfLiquied;
                } else if (secondContainer - amountOfLiquied < 0 && amountOfLiquied > 0) {
                    secondContainer = 0;
                }
            }
        }
    }
}

