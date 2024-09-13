package com.onlineauction;


public class reserve extends auctionb {
    private double reservePrice;
    private double highestBid;

    public reserve(auction auctioneer, double reservePrice) {
        super(auctioneer);
        this.reservePrice = reservePrice;
    }

    @Override
    protected void conductBiddingProcess() {
        System.out.println("Conducting reserve auction bidding process...");
        auctioneer.notifyBidders("Reserve price auction is in progress...");
        // Simulate a bidding process
        highestBid = 200; // This could be dynamically updated with actual bids
    }

    @Override
    protected void declareWinner() {
        if (highestBid >= reservePrice) {
            System.out.println("Reserve price met. Declaring winner.");
            auctioneer.notifyBidders("Winner has been declared for the reserve auction.");
        } else {
            System.out.println("Reserve price not met. No winner.");
            auctioneer.notifyBidders("Reserve price not met. No winner declared.");
        }
    }
}
