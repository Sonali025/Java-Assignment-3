package JavaAssignment3;

public class Customer {
	private String name;
	private String address;
	private double mobileNumber;
	Account account;

	public Customer(String name, String address, double mobileNumber, Account account) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.account = account;
	}
   
	public String getName() {
		return name;
	}

	public String getaccNo() {
		return account.accountNumber;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void withdraw(double amt) {
		if (Bank.maxWithdrawelLimit > amt) {
			account.withDraw(amt);
		} else {
			System.out.println("Maximum withdraw Limit exeeds");
		}
	}
	
	public void deposit(double amt)
	{
		account.balance+=amt;
	}

	public void getAccountDetails() {
		System.out.println(account);
	}

	public void transferAmount(Account account1, double amt) {
		if (this.account.balance > amt) {
			this.account.withDraw(amt);
			account1.deposit(amt);
			System.out.println("amount transfered successfully...");
		}
		else
		{
			System.out.println("insufficient funds for transfer...");
		}
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void displayDetails()
	{
		System.out.println("Name:-"+name+" Mobile no"+mobileNumber+" Address"+address+" Account Number: "+account.accountNumber+" account Balance:"+account.balance);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + ", account="
				+ account + "]";
	}
}
