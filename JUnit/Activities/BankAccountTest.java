public class BankAccountTest {
    private Integer balance;
    
    public BankAccountTest(int i) {
		// TODO Auto-generated constructor stub
	}

	// Create a constructor
    public void BankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    public void BankAccount(int initialBalance) {
		// TODO Auto-generated constructor stub
	}

	public void BankAccount1(int initialBalance) {
		// TODO Auto-generated constructor stub
	}

	// Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new NotEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}