import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        List<String> names =  new ArrayList<>();
        names.add("first");
        names.add("second");
        names.add("third");

        System.out.println(returnSize(names));

    }

   public static int returnSize(List<String> obj) {
        return obj.size();
   }
}
