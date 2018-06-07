package bankaccountapp;

public class Savings extends Account {

	// List properties specific to the savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name) {
		super(name);
		System.out.println("NEW SAVINGS ACCOUNT");
		System.out.println("NAME: " + name);
	}
	
	// List any methods specific to savings account
	
}
