package AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        
        AbtractFactory banlFactory=FactoryCreator.geFactory("Bank");
        Bank b=banlFactory.geBank("HDFC");

        double rate=7.5;
        int amt=650000;
        int y=2;

        AbtractFactory loanFactory=FactoryCreator.geFactory("Loan");
        LOAN l=loanFactory.getLoan("Home");
        l.getIntrestRate(rate);
        l.CalcuateLoan(amt, y);
    }
}
