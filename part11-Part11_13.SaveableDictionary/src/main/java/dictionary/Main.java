package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("word.txt");
        s.load();
        System.out.println();
        s.save();
    }
}
