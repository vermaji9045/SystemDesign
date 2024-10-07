import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {

    List<Colleague> bidders=new ArrayList<Colleague>();

    @Override
    public void addBidder(Colleague bidder) {

        this.bidders.add(bidder);

    }

    @Override
    public void pleceBid(Colleague bidder, int amount) {

        for(Colleague colleague : bidders)
        {
            if (!colleague.getName().equalsIgnoreCase(bidder.getName()))
            {
                colleague.receiveBidNotification(amount);
            }
        }
    }
}
