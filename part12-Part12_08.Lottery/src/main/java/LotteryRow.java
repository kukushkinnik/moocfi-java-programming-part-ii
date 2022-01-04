
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;
    private final int totalOfNumbers;

    public LotteryRow() {
        this.random = new Random();
        this.totalOfNumbers = 7;
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        int min = 1;
        int max = 40;

        this.numbers = new ArrayList<>();
        int randomNumber = this.random.nextInt(max - min + 1) + min;

        while(this.numbers.size() != this.totalOfNumbers) {
            if(!this.containsNumber(randomNumber)) {
                this.numbers.add(randomNumber);
            }
            randomNumber = this.random.nextInt(max - min + 1) + min;
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

