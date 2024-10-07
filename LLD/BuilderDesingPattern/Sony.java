package BuilderDesingPattern;

public class Sony extends Company{

    @Override
    public int price() {
       
        return 15;
    }

    @Override
    public String pack() {
        
        return "SonyCD";
    }

}
