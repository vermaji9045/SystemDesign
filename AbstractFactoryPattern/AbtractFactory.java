package AbstractFactoryPattern;

public interface AbtractFactory {
    
    public Bank geBank(String bank);
    public LOAN getLoan(String loan);

}
