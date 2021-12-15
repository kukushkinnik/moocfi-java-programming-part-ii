public class Container {
    private int amountOfLiquid;

 public Container(){}

    public int contains() {
        return this.amountOfLiquid;
    }

    public void add(int amount) {
        if(amount > 0 && this.amountOfLiquid + amount <= 100) {
            this.amountOfLiquid += amount;
        } else if (amount > 0 && this.amountOfLiquid + amount > 100) {
            this.amountOfLiquid = 100;
        }
    }

    public void remove(int amount) {
        if (amount > 0 && this.amountOfLiquid - amount > 0) {
            this.amountOfLiquid -= amount;
        } else if (amount > 0 && this.amountOfLiquid - amount < 0) {
            this.amountOfLiquid = 0;
        }
    }

    public String toString() {
        return this.amountOfLiquid + "/" + "100";
    }
}
