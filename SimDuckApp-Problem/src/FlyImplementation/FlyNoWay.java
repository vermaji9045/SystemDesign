package FlyImplementation;

import Interface.FlyBhavior;

public class FlyNoWay implements FlyBhavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
