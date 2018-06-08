package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "D:\\NewBankAccounts.csv";
		
		/*
		Checking chkacc1 = new Checking("Tim Wilson","321456879",1500 );
		
		Savings savacc1 = new Savings("Rich Love","456657897",2500);
		
		savacc1.showInfo();
		System.out.println("*****************************");
		chkacc1.showInfo();
		*/
		
		// Read a CSV File then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			System.out.println(name + " " + sSN + " " + accountType + " $" + initDeposit);
			
			if (accountType.equals("Savings")) {
				System.out.println("OPEN A SAVINGS ACCOUNT");
			}
			else if (accountType.equals("Checking")) {
				System.out.println("OPEN A CHECKING ACCOUNT");
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
	}

}
