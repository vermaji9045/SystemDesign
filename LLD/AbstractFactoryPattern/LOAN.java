package AbstractFactoryPattern;

abstract class LOAN  {

    abstract void getIntrestRate(double rate);
   protected double rate;
   

   
   public void CalcuateLoan(double loanamt,int years)
   {

    double EMI;
    int n;

    n=years*12;
    rate=rate/1200;
    EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamt;

    System.out.println("Your Monthly EMI IS for this " +EMI + "For the amount:" + loanamt + "you have borrowed");
   }


}
