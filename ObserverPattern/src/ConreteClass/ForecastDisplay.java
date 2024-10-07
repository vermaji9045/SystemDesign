package ConreteClass;

import Interface.Display;
import Interface.Observer;
import Interface.Subject;

public class ForecastDisplay implements Observer, Display {


    private float temperature;
    private float humidity;
    private float pressure;

    Subject wheatherData;
    public ForecastDisplay(Subject wheatherData) {
        this.wheatherData = wheatherData;

    }
    @Override
    public void display() {

        System.out.println("Forecast:"+temperature+"F degrees and "+humidity+"% humidity"+" and "+pressure+" pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {

        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
