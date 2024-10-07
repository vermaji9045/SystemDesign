package AbstractFactoryPattern;

public class SBI implements Bank{

    private final String Name;

    SBI()
    {
        Name="SBI";
    }
    @Override
    public String getBankName() {
       
        return Name;
    }

}
