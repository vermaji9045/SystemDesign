package AbstractFactoryPattern;

public class HDFC implements Bank {

    private final String Name;
    HDFC()
    {
       Name="HDFC";
    }
    @Override
    public String getBankName() {
       
        return Name;
    }



}
