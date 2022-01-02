import java.util.ArrayList;

public class Pipe <E>{
    private ArrayList<E> elements;

    public Pipe() {
        this.elements = new ArrayList<>();
    }

    public void putIntoPipe(E value) {
        this.elements.add(value);
    }

    public E takeFromPipe() {
        E element;
        if(!this.elements.isEmpty()) {
            element = this.elements.get(0);
            this.elements.remove(0);
            return element;
        }
        return null;
    }

    public boolean isInPipe() {
        if (!this.elements.isEmpty()) {
            return true;
        }
        return false;
    }
}
