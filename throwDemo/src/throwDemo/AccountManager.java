package throwDemo;

public class AccountManager {
	private double balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws BallanceInsufficentException {
		if(balance>=amount) {
			balance-=amount;
		}else {
			throw new BallanceInsufficentException("Bakiye yetersiz");
		}
	}

	public double getBalance() {
		return balance;
	}
}
