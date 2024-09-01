package AbstractFactoryPattern;

public class LoanFactory implements AbtractFactory{

    @Override
    public Bank geBank(String bank) {
       
        return null;
    }

    @Override
    public LOAN getLoan(String loan) {
     
        if(loan==null)
        {
            return null;
        }else if(loan.equals("Home"))
        {
            return new HomeLoan();
        }else if(loan.equals("EDU"))
        {
            return new EducationLoan();
        }else if(loan.equals("BUSS"))
        {
            return new BusinessLoan();
        }

        return null;
    }

}
