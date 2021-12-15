import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private final int maxWeight;
    private final ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    private int currentWeight() {
        int currentWeight = 0;
        for(Item item : items) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public void add(Item item) {
        if(this.currentWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
}
