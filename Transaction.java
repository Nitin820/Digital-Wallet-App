package Transaction;
import java.util.*;
public class Transaction {
    private String transactionId;
    private String sender;
    private String recipient;
    private double amount;
    private TransactionStatus status;

    public Transaction(String sender, String recipient, double amount) {
        this.transactionId = UUID.randomUUID().toString();
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.status = TransactionStatus.PENDING;
    }

    // Getters and setters
    public String getTransactionId() {
        return transactionId;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
}

enum TransactionStatus {
    PENDING,
    COMPLETED,
    FAILED
}