package BuilderDesingPattern;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    private List<Packing> item=new ArrayList<>();

    public void addItem(Packing packing)
    {
        item.add(packing);
    }

    public void getCost()
    {
        for(Packing packs: item)
        {
            packs.price();
        }
    }

    public void showItem()
    {
        for(Packing packing: item)
        {
            System.out.println("CD Name:"+packing.pack());
            System.out.println("Price:"+packing.price());
        }
    }

}
