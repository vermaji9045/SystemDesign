package FlyImplementation;

import Interface.FlyBhavior;

public class FlyRocketPowered implements FlyBhavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
