package AbstractFactoryPattern;

public class ICIC implements Bank {


    private final String Name;

    ICIC()
    {
        Name="ICIC";
    }
    @Override
    public String getBankName() {
        
        return Name;
    }

}
