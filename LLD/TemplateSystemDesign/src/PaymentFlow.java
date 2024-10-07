public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void debitMoney();
    public abstract void calFees();

    public abstract void creditMoney();

    public final void SendMoney()
    {
        validateRequest(); // setp1
        debitMoney(); // setp2
        calFees(); // setp3
        creditMoney(); // setp4
    }

}
