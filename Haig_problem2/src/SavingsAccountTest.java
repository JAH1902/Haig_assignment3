// Jeffrey "Alex" Haig
// COP 3330
// Professor Hollander
// 2/27/2018

// A class that will test the SavingsAccount class by setting up two objects of that class type
public class SavingsAccountTest {

	// Method main that will run the program
	public static void main(String[] args) {
		
		// Sets up two objects that will be the class Savings Account
		SavingsAccount account1 = new SavingsAccount();
		SavingsAccount account2 = new SavingsAccount();
		
		// Sets the savings account balance for each object
		account1.setSavings(2000.0);
		account2.setSavings(3000.0);
		
		// Sets the interest rate value for each object
		account1.modifyInterestRate(4.0);
		account2.modifyInterestRate(4.0);
		
		// Displays the initial two lines
		System.out.println("Interest Rate: 4%");
		System.out.printf("      \t Account 1 \t Account 2 \n");
		
		// Loops through 12 times for each month
		for (int i = 0; i < 12; i++) {
			
			// Runs the method that will calculate the monthly interest for each object
			account1.calculateMonthlyInterest();
			account2.calculateMonthlyInterest();
			
			// Displays the new balance of the savings account
			System.out.printf("Month %d :   $%.2f    $%.2f \n", i + 1, account1.getSavings(), account2.getSavings());
			
		}
		
		// Displays the new interest rate to be set up
		System.out.printf("Interest Rate: 5%% \n");
		
		// Modifies the interest rate for each object
		account1.modifyInterestRate(5.0);
		account2.modifyInterestRate(5.0);
		
		// Calculates the last savings balance account with this new interest rate
		account1.calculateMonthlyInterest();
		account2.calculateMonthlyInterest();
		
		// Displays the 13th month's final balance amount for both savings account
		System.out.printf("Month 13 :   $%.2f   $%.2f \n", account1.getSavings(), account2.getSavings());

	}

}
