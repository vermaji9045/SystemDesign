package BuilderDesingPattern;

public class BuilderDemo {

    public static void main(String[] args) {
        
        CDBuilder cdBuilder=new CDBuilder();

        CDType cdType=cdBuilder.BuildSonyCD();
        cdType.showItem();

       CDType cdBuilder2=cdBuilder.BuildSamsungCD();
       cdBuilder2.showItem();
    }

}
