
public class SavingsAccountTest {

	public static void main(String[] args) {
		
		SavingsAccount account1 = new SavingsAccount();
		SavingsAccount account2 = new SavingsAccount();
		
		account1.setSavings(2000.0);
		account2.setSavings(3000.0);
		
		account1.modifyInterestRate(4.0);
		account2.modifyInterestRate(4.0);
		
		System.out.println("Interest Rate: 4%");
		
		System.out.printf("      \t Account 1 \t Account 2 \n");
		
		for (int i = 0; i < 12; i++) {
			
			account1.calculateMonthlyInterest();
			account2.calculateMonthlyInterest();
			
			System.out.printf("Month %d :   $%.2f    $%.2f \n", i + 1, account1.getSavings(), account2.getSavings());
			
		}
		
		System.out.printf("Interest Rate: 5%% \n");
		
		account1.modifyInterestRate(5.0);
		account2.modifyInterestRate(5.0);
		
		account1.calculateMonthlyInterest();
		account2.calculateMonthlyInterest();
		
		System.out.printf("Month 13 :   $%.2f   $%.2f \n", account1.getSavings(), account2.getSavings());

	}

}
