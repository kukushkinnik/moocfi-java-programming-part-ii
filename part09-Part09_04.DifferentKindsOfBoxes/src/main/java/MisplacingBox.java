import java.util.ArrayList;

public class MisplacingBox extends Box{
    private final ArrayList<Item> items;

    public MisplacingBox() {
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return  false;
    }
}
