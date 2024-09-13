package com.onlineauction;


public class standard extends auctionb {

    public standard(auction auctioneer) {
        super(auctioneer);
    }

    @Override
    protected void conductBiddingProcess() {
        System.out.println("Conducting standard auction bidding process...");
        auctioneer.notifyBidders("Bidding is in progress...");
    }

    @Override
    protected void declareWinner() {
        System.out.println("Declaring winner for standard auction.");
        auctioneer.notifyBidders("Winner has been declared for the standard auction.");
    }
}

