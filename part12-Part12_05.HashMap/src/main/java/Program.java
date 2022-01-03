
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> helloMsg = new HashMap<>();

        helloMsg.add("Hello", "World");

        System.out.println(helloMsg.get("Hello")  +helloMsg.get("World") );
    }

}
