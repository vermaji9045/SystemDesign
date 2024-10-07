package QuackImplementation;

import Interface.QuackBehavior;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squack");
    }
}
