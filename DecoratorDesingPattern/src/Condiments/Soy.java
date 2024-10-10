package Condiments;

import AbstractClass.Bevrage;
import AbstractClass.CondimentsDecorator;

public class Soy extends CondimentsDecorator {

    Bevrage b;

    public Soy(Bevrage b) {
        this.b = b;
    }
    @Override
    public double cost() {
        return 20+b.cost();
    }

    @Override
    public String getDescription() {
        return b.getDescription()+", with Soy";
    }
}
