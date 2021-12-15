import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {
    private final Map<String, Integer> storage;
    private final Map<String, Integer> stock;

    public  Warehouse() {
        this.storage = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.storage.put(product, price);
        this.stock.put(product, stock);
    }

    public int price (String product) {
        if(this.storage.containsKey(product)) {
            return this.storage.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if(this.stock.containsKey(product)) {
            if (this.stock.get(product) - 1 >= 0) {
                this.stock.put(product, this.stock.get(product) - 1);
                return true;
            }
        }
        return  false;
    }

    public Set<String> products() {
        Set<String> items = new HashSet<>();
        for (String item : this.stock.keySet()) {
            items.add(item);
        }
        return items;
    }
}
