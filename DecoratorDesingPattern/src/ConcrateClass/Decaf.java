package ConcrateClass;

import AbstractClass.Bevrage;

public class Decaf extends Bevrage {

    public Decaf() {
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 90;
    }
}
