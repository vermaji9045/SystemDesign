package Condiments;
import AbstractClass.*;
public class Milk extends CondimentsDecorator {


    Bevrage b;
    public Milk(Bevrage b) {
        this.b = b;
    }
    @Override
    public double cost() {
        return 10+b.cost();
    }

    @Override
    public String getDescription() {
        return b.getDescription()+"with Milk";
    }
}
