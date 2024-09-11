package Transaction;

import java.util.*;

public class TransactionService {
    private List<Transaction> transactionHistory;

    public TransactionService() {
        transactionHistory = new ArrayList<>();
    }

    public boolean processTransaction(Transaction transaction, Wallet senderWallet, Wallet recipientWallet) {
        if (transaction.getAmount() <= 0 || transaction.getAmount() > senderWallet.getBalance()) {
            transaction.setStatus(TransactionStatus.FAILED);
            return false;
        }

        senderWallet.debit(transaction.getAmount());
        recipientWallet.credit(transaction.getAmount());
        transaction.setStatus(TransactionStatus.COMPLETED);
        transactionHistory.add(transaction);
        return true;
    }

    public List<Transaction> getTransactionHistory() {
        return Collections.unmodifiableList(transactionHistory);
    }
}