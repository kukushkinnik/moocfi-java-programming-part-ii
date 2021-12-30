package application;

public class TemperatureSensor implements Sensor{
    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }
    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        int min = -30;
        int max = 30;
        int range = (max - min) + 1;
       if(this.state == true) {
           return (int)(Math.random() * range)+min;
       } else {
           throw new IllegalStateException();
       }
    }

}
