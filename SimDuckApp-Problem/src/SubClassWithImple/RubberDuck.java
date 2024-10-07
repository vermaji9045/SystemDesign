package SubClassWithImple;

import SuperClass.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a rubber duck! So i can't fly or quack");
    }
}
