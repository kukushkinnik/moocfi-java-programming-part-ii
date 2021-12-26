public class Person {
    private final String name;
    private final Education educationLvl;

    public Person(String name, Education educationLvl) {
        this.name = name;
        this.educationLvl = educationLvl;
    }

    public Education getEducation() {
        return this.educationLvl;
    }

    public String toString() {
        return this.name + ", " + this.educationLvl;
    }
}
