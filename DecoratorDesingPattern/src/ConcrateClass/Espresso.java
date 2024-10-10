package ConcrateClass;

import AbstractClass.Bevrage;

public class Espresso extends Bevrage {


    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 80;
    }
}
