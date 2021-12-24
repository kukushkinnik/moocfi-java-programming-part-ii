
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<String> linesFromFile = readFile("literacy.csv");
        linesFromFile.stream()
                .map(line -> line.split(","))
                .sorted((x,y) -> x[5].compareTo(y[5]))
                .forEach(row -> System.out.println(row[3] + " (" + row[4] + "), " + row[2].split(" ")[1].trim() + ", " + row[5]) );
    }

    public static List<String> readFile(String file) {
        List<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    return rows;
    }
}
