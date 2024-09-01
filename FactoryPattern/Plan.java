abstract class Plan
{
   protected int rate;

   abstract void getRate();

   public void calBill(int unit)
   {
       System.out.println("Total Calculate Bill:"+rate*unit);
   }

}
