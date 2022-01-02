
public class Hideout <T>{
    private T element;

    public Hideout() {}

    public void putIntoHideout(T toHide) {
        if(this.element != toHide) {
            this.element =  toHide;
        }

    }

    public T takeFromHideout() {
        T returning;
        if (this.element != null) {
            returning = this.element;
            this.element = null;
            return returning;
        }
        return null;
    }

    public boolean isInHideout() {
        if (this.element != null) {
            return true;
        }
        return false;
    }
}
