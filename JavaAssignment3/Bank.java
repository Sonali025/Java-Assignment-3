package JavaAssignment3;

public class Bank {
	private final String NAME = "SBI";
	public Account account[];
	public Customer customer[];
	private static double interestRate=0.03;
	static int maxWithdrawelLimit=10000;
	int MAX_SIZE = 10;
	int size = 0;

	public Bank() {
		this.account = new Account[MAX_SIZE];
		this.customer = new Customer[MAX_SIZE];
	}

	public void addAccount(String accNo, String name, String address, double mobNo) {
		if (size < MAX_SIZE) {
			int i = size;
			account[i] = new Account(accNo);
			customer[i] = new Customer(name, address, mobNo, account[i]);
			size++;
			//return account[i];
		} else {
			System.out.println("Bank is full...");
			//return null;
		}

	}

	public void removeBankAccount(String no) {
		for (int i = 0; i < size; i++) {
			if (account[i].accountNumber == no) {
				for(int j=i;j<size-1;j++)
				{
				account[j] = account[j+1];
				customer[j]=customer[j+1];
				
			}
		}
			
	}
		account[size]=null;
		customer[size]=null;
		size--;
	}

	public void displayDetails() {
		for (int i = 0; i < size; i++) {
			customer[i].displayDetails();
		}
	}

	public void updateDetails(String accNo, double mobNo) {
		for (int i = 0; i < size; i++) {
			if (customer[i].getAccount().accountNumber == accNo) {
				customer[i].setMobileNumber(mobNo);
			} 

		}
	}
	
	
	public void applyInterest(Account account1)
	{
		double interest=account1.balance*interestRate;
		account1.balance+=interest;
	}


}
