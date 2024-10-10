package Condiments;

import AbstractClass.Bevrage;
import AbstractClass.CondimentsDecorator;

public class Whip extends CondimentsDecorator {

    Bevrage b;
    public Whip(Bevrage b) {
        this.b = b;
    }
    @Override
    public double cost() {
        return 60+b.cost();
    }

    @Override
    public String getDescription() {
        return b.getDescription()+", with Whip";
    }
}
