package ConcrateClass;

import AbstractClass.Bevrage;

public class DarkRoast extends Bevrage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 70;
    }
}
