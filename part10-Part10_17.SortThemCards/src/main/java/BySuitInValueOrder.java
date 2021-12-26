import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        int suitValueOrder = o1.getSuit().ordinal() - o2.getSuit().ordinal();

        if (suitValueOrder == 0) {
            return o1.compareTo(o2);
        }

        return suitValueOrder;
    }
}
