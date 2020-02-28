
public class SavingsAccount {

	private double savingsBalance;
	
	private double annualInterestRate;
	
	public void calculateMonthlyInterest() {
		
		double interestAmount;
		
		interestAmount = this.savingsBalance * ((this.annualInterestRate/100)) / 12;

		this.savingsBalance += interestAmount;
		
	}
	
	public void modifyInterestRate(double newInterestRate) {
		
		this.annualInterestRate = newInterestRate;
		
	}
	
	public void setSavings(double a) {
		
		this.savingsBalance = a;
		
	}
	
	public double getSavings() {
		
		return this.savingsBalance;
		
	}

}


