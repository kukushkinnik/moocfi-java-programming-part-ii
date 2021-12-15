import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;
    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if(this.items.size() == 0) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

}
