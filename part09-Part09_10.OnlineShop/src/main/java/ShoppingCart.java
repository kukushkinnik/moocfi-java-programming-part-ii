import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Item> cart;

    public ShoppingCart() { this.cart = new HashMap<>(); }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);

        if(this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        }
        if(!this.cart.containsKey(product)){
            this.cart.put(product, item);
        }

    }

    public int price() {
        int total = 0;
        for (Item item : this.cart.values()) {
            total += item.price();
        }
        return  total;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }
}

