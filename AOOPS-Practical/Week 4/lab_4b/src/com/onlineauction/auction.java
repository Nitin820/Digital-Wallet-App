package com.onlineauction;

import java.util.ArrayList;
import java.util.List;

public class auction {
    private List<observer> bidders = new ArrayList<>();

    public void subscribe(observer bidder) {
        bidders.add(bidder);
        System.out.println(((bidder) bidder).getName() + " has subscribed.");
    }

    public void unsubscribe(observer bidder) {
        bidders.remove(bidder);
        System.out.println(((bidder) bidder).getName() + " has unsubscribed.");
    }

    public void notifyBidders(String event) {
        for (observer bidder : bidders) {
            bidder.update(event);
        }
    }

    public void startAuction() {
        notifyBidders("Auction has started.");
    }

    public void endAuction() {
        notifyBidders("Auction has ended.");
    }
}

