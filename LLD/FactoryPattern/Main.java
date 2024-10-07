public class Main {

    public static void main(String[] args) {

        GetPlanFactory getPlanFactory=new GetPlanFactory();

        String c="Com";
        int r=7;

       Plan p=getPlanFactory.getPlan(c);

       p.getRate();
       p.calBill(r);
    }
}
