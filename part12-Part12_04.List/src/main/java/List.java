public class List <Type>{
    private Type[] list;
    private int availableIndex;

    public List() {
        this.list = (Type[]) new Object[10];
    }

    public void add (Type value) {
        if(this.availableIndex == this.list.length) {
            grow();
        }
        this.list[availableIndex] = value;
        availableIndex++;
    }

    private void grow() {
        int newSize = (this.list.length * 3/2) + 1;
        Type[] newList = (Type[]) new Object[newSize];

        for(int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        this.list =  newList;
    }

    private int indexOfValue(Type value) {
        for(int i = 0; i < this.availableIndex; i++) {
            if(this.list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void moveToLeft(int fromIndex) {
        for(int i = fromIndex; i < this.availableIndex - 1; i++) {
            this.list[i] = this.list[i+1];
        }
    }

    public void remove(Type value) {
        int indexForValue = indexOfValue(value);

        if(indexForValue < 0) {
            return;
        }
        moveToLeft(indexForValue);
        this.availableIndex--;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public Type value (int index) {
        if(index < 0 || index >= this.availableIndex) {
            throw new ArrayIndexOutOfBoundsException("Inedx " + index + "outside of [0, " + this.availableIndex + "]");
        }
        return  this.list[index];
    }

    public int size() {
        return this.availableIndex;
    }
}
