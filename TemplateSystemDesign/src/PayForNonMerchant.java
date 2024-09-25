public class PayForNonMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {

        System.out.println("Validated the Request");
    }

    @Override
    public void debitMoney() {
        System.out.println(" Debit Money");
    }

    @Override
    public void calFees() {

        System.out.println("No fees calculate for Non Merchant");

    }

    @Override
    public void creditMoney() {
        System.out.println("Money credit to the receiver's Bank");
    }
}
