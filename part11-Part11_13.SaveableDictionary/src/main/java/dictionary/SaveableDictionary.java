package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictonary;
    private String fileName;

    public SaveableDictionary() {
        this.dictonary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
         this.fileName = file;
    }

    public boolean load() {
        try(Scanner fileReader =  new Scanner(Paths.get(this.fileName))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            return  false;
        }
        return true;
    }

    public boolean save()  {
        try( FileWriter fileWriter = new FileWriter(this.fileName)) {
            String key = "";
            String value = "";

            Iterator<Map.Entry<String, String>> iterator = this.dictonary.entrySet().iterator();
            while(iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                key = entry.getKey();
                value = entry.getValue();
                fileWriter.write(key + ":" + value +"\n");
            }

        }catch (Exception e) {
            return  false;
        }
       return true;
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
