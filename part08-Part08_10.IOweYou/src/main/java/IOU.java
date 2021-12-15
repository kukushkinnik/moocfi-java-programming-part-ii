import java.util.HashMap;

public class IOU {
    private final HashMap<String, Double> list;

    public IOU() {
        this.list = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.list.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return  this.list.getOrDefault(toWhom, (double) 0);
    }
}
