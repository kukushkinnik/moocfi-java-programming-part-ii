import java.util.HashMap;
public class Abbreviations {
    private final HashMap<String, String> abbs;

    public Abbreviations() {
        this.abbs = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbs.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbs.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (this.abbs.containsKey(abbreviation)) {
            return this.abbs.get(abbreviation);
        }
        return null;
    }

}
