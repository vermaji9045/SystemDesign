package ConreteClass;

import Interface.Display;
import Interface.Observer;
import Interface.Subject;

public class CurrentConditionDisplay implements Observer, Display {


    private float temperature;
    private float humidity;

    Subject wheatherData;
    public CurrentConditionDisplay(Subject wheatherData) {
        this.wheatherData = wheatherData;

    }



    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {

        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");

    }
}
