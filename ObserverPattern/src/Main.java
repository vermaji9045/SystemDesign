import ConreteClass.CurrentConditionDisplay;
import ConreteClass.ForecastDisplay;
import ConreteClass.StaticsDisplay;
import ConreteClass.WheatherData;

public class Main {
    public static void main(String[] args) {


        WheatherData wheatherData=new WheatherData();
        wheatherData.registerObserver(new CurrentConditionDisplay(wheatherData));
        wheatherData.registerObserver(new ForecastDisplay(wheatherData));
        wheatherData.registerObserver(new StaticsDisplay(wheatherData));
        wheatherData.setMeasurements(80,65,30.4f);
        wheatherData.setMeasurements(82,70,29.2f);
        wheatherData.setMeasurements(78,90,29.2f);
    }
}