import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand  implements  Comparable<Hand>{
   private List<Card> cardsOnHand;

    public Hand() {
        this.cardsOnHand = new ArrayList<>();
    }

    public void add(Card card) {
        this.cardsOnHand.add(card);
    }

    public void print() {
        this.cardsOnHand.stream()
                .forEach(card -> System.out.println(card));
    }

    public void sort() {
        Comparator<Card> comparator =  Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(this.cardsOnHand, comparator);
        }


        public void sortBySuit() {
            Comparator<Card> comparator =  Comparator
                    .comparing(Card::getSuit)
                            .thenComparing(Card::getValue);
            Collections.sort(this.cardsOnHand, comparator);

        }

    @Override
    public int compareTo(Hand o) {

        int sumOfOtherHand = o.cardsOnHand.stream()
                .mapToInt(value -> value.getValue())
                .reduce(0, (prevSum, value) -> value + prevSum);

        int sumOfOneHand  = this.cardsOnHand.stream()
                .mapToInt(value -> value.getValue())
                .reduce(0, (prevSum, value) -> value + prevSum);


        return sumOfOneHand  - sumOfOtherHand;
    }

}

