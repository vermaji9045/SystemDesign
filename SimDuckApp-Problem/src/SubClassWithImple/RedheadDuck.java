package SubClassWithImple;

import SuperClass.Duck;

public class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}
