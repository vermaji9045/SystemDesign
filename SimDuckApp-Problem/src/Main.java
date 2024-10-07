import FlyImplementation.FlyRocketPowered;
import FlyImplementation.FlyWithWings;
import QuackImplementation.Quack;
import SubClassWithImple.DuckModel;
import SubClassWithImple.MallardDuck;
import SuperClass.Duck;

public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Quack());
        mallard.performFly();
        mallard.performQuack();
        mallard.display();


         Duck model = new DuckModel();
         model.performFly();
         model.setFlyBehavior(new FlyRocketPowered());
         model.performFly();


    }
}