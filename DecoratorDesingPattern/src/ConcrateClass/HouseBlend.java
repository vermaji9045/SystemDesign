package ConcrateClass;

import AbstractClass.Bevrage;

public class HouseBlend extends Bevrage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 50;
    }
}
