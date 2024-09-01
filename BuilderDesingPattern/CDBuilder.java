package BuilderDesingPattern;

public class CDBuilder {

    public CDType BuildSonyCD()
    {
        CDType cds=new CDType();

        cds.addItem(new Sony());

        return cds;
    }

    public CDType BuildSamsungCD()
    {
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        return cds;
    }

}
