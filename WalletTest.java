package Transaction;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class WalletTest {
    private Wallet wallet;
    private Wallet recipientWallet;
    private TransactionService transactionService;

    @BeforeEach
    public void setup() {
        wallet = new Wallet("user1", 1000.0);
        recipientWallet = new Wallet("user2", 500.0);
        transactionService = new TransactionService();
    }

    @Test
    public void testDebit() {
        wallet.debit(200.0);
        assertEquals(800.0, wallet.getBalance());
    }

    @Test
    public void testCredit() {
        wallet.credit(300.0);
        assertEquals(1300.0, wallet.getBalance());
    }

    @Test
    public void testProcessTransaction() {
        Transaction transaction = new Transaction("user1", "user2", 300.0);
        boolean success = transactionService.processTransaction(transaction, wallet, recipientWallet);

        assertTrue(success);
        assertEquals(700.0, wallet.getBalance());
        assertEquals(800.0, recipientWallet.getBalance());
    }

    @Test
    public void testFailedTransactionInsufficientFunds() {
        Transaction transaction = new Transaction("user1", "user2", 2000.0);
        boolean success = transactionService.processTransaction(transaction, wallet, recipientWallet);

        assertFalse(success);
        assertEquals(1000.0, wallet.getBalance());
        assertEquals(500.0, recipientWallet.getBalance());
    }
}

