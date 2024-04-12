package JavaAssignment3;

public class SavingsAccount {
	static double annualInterestRate;
	private double savingsBalance;
	private double interest;

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;

	}

	public SavingsAccount() {

		savingsBalance = 0.0;

	}

	public void calculateMonthlyInterest() {
		interest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = interest + savingsBalance;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate / 100;
	}

	@Override
	public String toString() {
		return "SavingsAccount [savingsBalance=" + savingsBalance + ", interest=" + interest + "]";
	}

	public static void main(String[] args) {

		SavingsAccount saver1 = new SavingsAccount(20000);
		saver1.setAnnualInterestRate(3);
		saver1.calculateMonthlyInterest();
		System.out.println(saver1);
		SavingsAccount saver2 = new SavingsAccount(30000);
		saver2.setAnnualInterestRate(4);
		saver2.calculateMonthlyInterest();
		System.out.println(saver2);

	}

}
