package AbstractFactoryPattern;

public class BusinessLoan extends LOAN{

    @Override
    void getIntrestRate(double rate) {
       
        this.rate=rate;
    }

}
