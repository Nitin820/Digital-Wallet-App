package com.onlineauction;


public abstract class auctionb {
    protected auction auctioneer;

    public auctionb(auction auctioneer) {
        this.auctioneer = auctioneer;
    }

    public final void conductAuction() {
        notifyItemAvailability();
        startBidding();
        conductBiddingProcess();
        endBidding();
        declareWinner();
    }

    protected void notifyItemAvailability() {
        auctioneer.notifyBidders("Item is available for auction.");
    }

    protected void startBidding() {
        auctioneer.startAuction();
    }

    protected abstract void conductBiddingProcess(); // Step to be customized by subclasses

    protected void endBidding() {
        auctioneer.endAuction();
    }

    protected abstract void declareWinner(); // Step to be customized by subclasses
}
