import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void  clear() {
        this.list.clear();
    }

    public double minValue() {
        double minValue = this.list.get(0);
        for(Double status : this.list) {
            if(status < minValue) {
                minValue = status;
            }
        }
        return minValue;
    }

    public double maxValue() {
        double maxValue = this.list.get(0);
        for(Double status : this.list) {
            if(status > maxValue) {
                maxValue = status;
            }
        }
        return maxValue;
    }

    public double average() {
        double sum = 0;
        double counter = this.list.size();
        for (Double status : this.list) {
            sum += status;
        }
        return sum / counter;
    }

    @Override
    public String toString() {
       return this.list.toString();
    }
}
