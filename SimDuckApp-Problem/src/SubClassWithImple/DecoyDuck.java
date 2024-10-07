package SubClassWithImple;

import SuperClass.Duck;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
