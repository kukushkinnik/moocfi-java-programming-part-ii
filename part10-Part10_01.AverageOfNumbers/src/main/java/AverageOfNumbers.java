import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listOfNumbers = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();

            if(input.equals("end")) {
                break;
            }
            listOfNumbers.add(input);
        }

        double average = listOfNumbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }



}
