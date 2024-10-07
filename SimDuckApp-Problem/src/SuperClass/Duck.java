package SuperClass;

import Interface.FlyBhavior;
import Interface.QuackBehavior;

public abstract class Duck {


    private FlyBhavior flyBehavior;
   private QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void performFly()
    {
        flyBehavior.fly();
    }

   public void performQuack() {
        quackBehavior.quack();
    }

   public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBhavior fb)
    {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }
}
