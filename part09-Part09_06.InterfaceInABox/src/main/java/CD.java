public class CD implements Packable{

    private final String artist;
    private final String nameOfCD;
    private final int publicationYear;
    private final double weight;

    public CD(String artist, String nameOfCD, int publicationYear) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.nameOfCD + " (" + this.publicationYear + ")";
    }
}
