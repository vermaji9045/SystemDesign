public class PayForMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validated the Request");
    }

    @Override
    public void debitMoney() {
        System.out.println("Money to be debited");
    }

    @Override
    public void calFees() {

        System.out.println("2 % fees to be deduct");

    }

    @Override
    public void creditMoney() {
        System.out.println("Money will be credit");
    }
}
