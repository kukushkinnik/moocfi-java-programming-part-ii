import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Checker checker = new Checker();
        
        System.out.println(checker.isDayOfWeek(input));
        System.out.println(checker.allVowels(input));
        System.out.println(checker.timeOfDay(input));

    }
}
