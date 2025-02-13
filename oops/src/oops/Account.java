package oops;

public class Account {
	int acc_no;
	String name;
	float amount;
	
//	method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
//	deposit method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}
	
//	withdraw method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		}else {
			amount = amount-amt;
			
		}
	}
//	method to check the balance in the account
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}
	
//	method to display the values of an object
	void display() {
		System.out.println(acc_no+" "+name+""+amount);
	}
	
//	creating a test class to deposite and withdraw amount
	class TestAccount{
		public static void main(String[] args) {
			Account account = new Account();
			account.insert(987654, " Naveen ", 1000);
			account.display();
			account.checkBalance();
			account.deposit(4000);
			account.checkBalance();
			account.withdraw(1000);
			account.checkBalance();
		}
	}
}
