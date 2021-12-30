package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private List<Sensor>parts;
    private List<Integer> readingsList;

    public AverageSensor() {
        this.parts = new ArrayList<>();
        this.readingsList = new ArrayList<>();
    }
    @Override
    public boolean isOn() {
        for(Sensor sensor : this.parts) {
            if(sensor.isOn()) {
                return true;
            }
        }
       return  false;
    }

    @Override
    public void setOn() {
      for(Sensor sensor : this.parts) {
          if(!sensor.isOn()) {
              sensor.setOn();
          }
      }
    }

    @Override
    public void setOff() {
        for(Sensor sensor:this.parts) {
            if(sensor.isOn()) {
                sensor.setOff();
            }
        }
    }

    @Override
    public int read() {
        int avrg = 0;

       if(this.isOn()) {
           for(Sensor sensor : this.parts) {
               avrg += sensor.read();
           }
       } else {
           throw new IllegalStateException();
       }
        avrg /= this.parts.size();
       this.readingsList.add(avrg);
       return avrg;
    }

    public void addSensor(Sensor sensor) {
        this.parts.add(sensor);
    }

    public List<Integer> readings() {
        return readingsList;
    }

}
