package com.onlineauction;


public class Main {
    public static void main(String[] args) {
        auction auctioneer = new auction();

        
        bidder bidder1 = new bidder("Alice");
        bidder bidder2 = new bidder("Bob");
        auctioneer.subscribe(bidder1);
        auctioneer.subscribe(bidder2);

        
        auctionb standardAuction = new standard(auctioneer);
        System.out.println("\n--- CONDUCTING STANDARD -----");
        standardAuction.conductAuction();

        auctionb reserveAuction = new reserve(auctioneer, 250);
        System.out.println("\n--- CONDUCTING REVERSE  ---");
        reserveAuction.conductAuction();

        
        auctioneer.unsubscribe(bidder2);
        System.out.println("\n--- CONDUCTING ANOTHER STANDARD ---");
        standardAuction.conductAuction();
    }
}

