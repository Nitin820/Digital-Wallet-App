package Transaction;

public class Wallet {
    private String userId;
    private double balance;

    public Wallet(String userId, double initialBalance) {
        this.userId = userId;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

	public String getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

	
}
