package AbstractFactoryPattern;

public class HomeLoan extends LOAN {

    @Override
    void getIntrestRate(double rate) {
      
        this.rate=rate;
    }

}
