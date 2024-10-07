package AbstractFactoryPattern;

public class FactoryCreator {


    public static AbtractFactory geFactory(String ch)
    {
        if(ch.equalsIgnoreCase("Bank"))
        {
            return new BankFactory();
        }
        else if(ch.equalsIgnoreCase("Loan"))
        {
            return new LoanFactory();
        }
        return null;
    }

}
