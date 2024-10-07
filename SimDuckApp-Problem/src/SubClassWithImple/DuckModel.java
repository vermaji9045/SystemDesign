package SubClassWithImple;

import FlyImplementation.FlyNoWay;
import Interface.FlyBhavior;
import Interface.QuackBehavior;
import QuackImplementation.Quack;
import SuperClass.Duck;

public class DuckModel extends Duck {




    /**
     * Default constructor that assigns a FlyNoWay as the flyBehavior
     * and a Quack as the quackBehavior.
     */
    public DuckModel() {


       setFlyBehavior(new FlyNoWay());
       setQuackBehavior(new Quack());


    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
