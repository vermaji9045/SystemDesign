package AbstractFactoryPattern;

public class BankFactory implements AbtractFactory{

    @Override
    public Bank geBank(String bank) {
       
        
        if (bank==null) {

            return null;
            
        }else if(bank.equals("HDFC"))
        {
            return new HDFC();
        } else if(bank.equals("SBI"))
        {
            return new SBI();
        } else if(bank.equals("ICIC"))
        {
            return new ICIC();
        }

        return null;
    }

    @Override
    public LOAN getLoan(String loan) {
       
       
        return null;
    }

   
 
}
