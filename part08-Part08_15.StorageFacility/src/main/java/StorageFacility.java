import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private final HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        if (this.storage.containsKey(unit)) {
            return this.storage.get(unit);
        }
        return new ArrayList<>();
    }

    public void remove(String unit, String item) {
        if (this.storage.containsKey(unit)) {
            this.storage.get(unit).remove(item);
        }

        if (this.storage.get(unit).isEmpty()) {
            this.storage.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String key : this.storage.keySet()) {
            if(!(this.storage.values().isEmpty())) {
                units.add(key);
            }
        }
        return units;
    }
}


