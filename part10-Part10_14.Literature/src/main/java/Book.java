public class Book {
    private String name;
    private String ageRecommendation;

    public Book(String name, String ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return this.name;
    }

    public String getAgeRecommendation() {
        return this.ageRecommendation;
    }

    @Override
    public String toString() {
        return this.name  + " (" + "recommended for "  + this.ageRecommendation + " year-olds or older)";
    }
}
