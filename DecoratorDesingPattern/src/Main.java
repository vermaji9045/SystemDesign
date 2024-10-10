import AbstractClass.Bevrage;
import ConcrateClass.DarkRoast;
import ConcrateClass.Espresso;
import ConcrateClass.HouseBlend;
import Condiments.Milk;
import Condiments.Mocha;
import Condiments.Soy;
import Condiments.Whip;

public class Main {
    public static void main(String[] args) {


        Bevrage bevrage=new Espresso();

        bevrage=new Mocha(bevrage);

        System.out.println(bevrage.getDescription()+" "+bevrage.cost());

        Bevrage bevrag1=new DarkRoast();
        bevrag1=new Mocha(bevrag1);
        bevrag1=new Soy(bevrag1);

        System.out.println(bevrag1.getDescription()+" "+bevrag1.cost());


        Bevrage bevrag2=new HouseBlend();
        bevrag2=new Mocha(bevrag2);
        bevrag2=new Milk(bevrag2);
        bevrag2=new Whip(bevrag2);
        System.out.println(bevrag2.getDescription()+" "+bevrag2.cost());


    }
}