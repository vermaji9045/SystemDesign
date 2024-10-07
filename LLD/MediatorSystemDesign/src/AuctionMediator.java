public interface AuctionMediator {

    public void addBidder(Colleague bidder);
    public void pleceBid(Colleague bidder, int amount);
}
