import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private final List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : this.list) {
            movable.move(dx,dy);
        }
    }


    @Override
    public String toString() {
        String rep = "";
        for (Movable movable : this.list) {
            rep += movable.toString() + "\n";
        }
        return rep;
    }
}
