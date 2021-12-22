
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while(true) {
            String userInput = scanner.nextLine();
            int userInputInNumbers = Integer.parseInt(userInput);

            if(userInputInNumbers < 0) {
                break;
            }
            listOfNumbers.add(userInputInNumbers);
        }

        listOfNumbers.stream()
                .filter(number -> number >= 1 && number <= 5)
                .forEach(number -> System.out.println(number));

    }
}
