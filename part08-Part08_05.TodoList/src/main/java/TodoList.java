
import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void remove(int number) {
        int index = number - 1;
        if (index < 0 || index >= this.list.size()) {
            return;
        }
       this.list.remove(index);
    }

    public  void print() {
        int counter = 1;
        for (String task : this.list) {
            System.out.println(counter + ": " + task);
            counter++;
        }
    }


}
