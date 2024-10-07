public class Main {
    public static void main(String[] args) {

        AuctionMediator auctionMediator = new Auction();

        Colleague colleague = new Bidder("A",auctionMediator);
        Colleague colleague2 = new Bidder("B",auctionMediator);

        colleague.placeBid(200);
        colleague2.placeBid(300);
        colleague2.placeBid(400);
    }
}