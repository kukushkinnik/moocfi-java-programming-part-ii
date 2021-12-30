package dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SaveableDictionary {
    private HashMap<String, String> dictonary;

    public SaveableDictionary() {
        this.dictonary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictonary.putIfAbsent(word, translation);
    }

    public String translate(String word) {

        for (Map.Entry<String, String> entry : this.dictonary.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }

            if (entry.getKey().equals(word)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void delete(String word) {
        String key = "";
        String value = "";

        Iterator<Map.Entry<String, String>> iterator = this.dictonary.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if (entry.getKey().equals(word) || entry.getValue().equals(word)) {
                key = entry.getKey();
                value = entry.getValue();
            }
        }
        this.dictonary.remove(key, value);
    }
}
