package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tim Wilson","321456879",1500 );
		
		Savings savacc1 = new Savings("Rich Love","456657897",2500);
		
		savacc1.showInfo();
		System.out.println("*****************************");
		chkacc1.showInfo();
		
		savacc1.deposit(5000);
		savacc1.withdraw(200);
		savacc1.transfer("Brokerage", 3000);
		
		// Read a CSV File then create new accounts based on that data

	}

}
