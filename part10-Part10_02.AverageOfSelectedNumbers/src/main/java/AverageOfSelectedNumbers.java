import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> number = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("end")) {
                break;
            }

            number.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if(command.equals("p")) {
            double avrgOfPositive = number.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + avrgOfPositive);
        }

        if(command.equals("n")) {
            double avrgOfNegative = number.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + avrgOfNegative);
        }

    }
}
