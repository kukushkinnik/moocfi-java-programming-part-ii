
import java.util.*;
import java.util.stream.Collectors;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> listOfBooks= new ArrayList<>();

        while(true) {
            System.out.print("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if(name.equals("")) {
                break;
            }

            System.out.print("Input the age recommendation:");
            String ageRecommendation = scanner.nextLine();
            listOfBooks.add(new Book(name, ageRecommendation));
            System.out.println();
        }
        System.out.println();

        System.out.println(listOfBooks.size() + " books in total.");

        System.out.println();

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                        .thenComparing(Book::getName);

        Collections.sort(listOfBooks, comparator);

        System.out.println("Books:");
        for(Book book : listOfBooks) {
            System.out.println(book);
        }

    }

}
