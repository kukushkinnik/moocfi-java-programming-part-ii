import java.util.ArrayList;

public class Box implements Packable{

    private  final double maxWeightCapacity;
    private final ArrayList<Packable> items;

    public Box(double maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if(this.weight() + item.weight() < this.maxWeightCapacity) {
            this.items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for(Packable item : this.items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}


