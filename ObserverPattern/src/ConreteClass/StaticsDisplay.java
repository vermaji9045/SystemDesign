package ConreteClass;

import Interface.Display;
import Interface.Observer;
import Interface.Subject;

public class StaticsDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;

    Subject wheatherData;

    public StaticsDisplay(Subject wheatherData) {
        this.wheatherData = wheatherData;
        wheatherData.registerObserver(this);
    }

    @Override
    public void display() {

        System.out.println("StaticsDisplay:"+temperature+"F degrees and "+humidity+"% humidity"+" and "+pressure+" pressure");
    }


    /**
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
}
