package Transaction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        TransactionService transactionService = new TransactionService();
        AuthenticationService authenticationService = new AuthenticationService();

        Wallet user1Wallet = new Wallet("user1", 1000.0);
        Wallet user2Wallet = new Wallet("user2", 500.0);

        Scanner scanner = new Scanner(System.in);

        String otp = authenticationService.generateOTP();
        System.out.println("OTP: " + otp);
        System.out.println("Enter OTP:");
        String inputOTP = scanner.nextLine();

        if (authenticationService.verifyOTP(inputOTP, otp)) {
            System.out.println("OTP verified. Access granted.");

            // Display initial balances
            System.out.println("User 1 Balance: $" + user1Wallet.getBalance());
            System.out.println("User 2 Balance: $" + user2Wallet.getBalance());

            // Simulate a transaction
            System.out.println("Enter amount to transfer from User 1 to User 2:");
            double amount = scanner.nextDouble();

            Transaction transaction = new Transaction(user1Wallet.getUserId(), user2Wallet.getUserId(), amount);
            boolean success = transactionService.processTransaction(transaction, user1Wallet, user2Wallet);

            if (success) {
                System.out.println("Transaction successful.");
            } else {
                System.out.println("Transaction failed. Insufficient funds.");
            }

            // Display updated balances
            System.out.println("User 1 Balance: $" + user1Wallet.getBalance());
            System.out.println("User 2 Balance: $" + user2Wallet.getBalance());
        } else {
            System.out.println("Invalid OTP. Access denied.");
        }

        scanner.close();
    }
}
