
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;
    private int start;
    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces = numberOfFaces;
        this.start = 1;
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it

        return this.start + this.random.nextInt(this.numberOfFaces - this.start + 1);
    }
}
