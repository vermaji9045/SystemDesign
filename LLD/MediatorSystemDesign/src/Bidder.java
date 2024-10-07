public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.pleceBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {

        System.out.println("Bidder"+this.getName() + " received bid of " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
