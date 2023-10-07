package codeSoft;

import java.util.Scanner;

public class Bank {
	
	private String name;
	private long account_number;
	private String type;
	private long amount=0;
	private long total=0;
	
	public void setValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account holder name:"+" ");
	    name=sc.nextLine();
		System.out.println("Enter Account number:");
		account_number=sc.nextLong();
		System.out.println("Enter Account type:"+" ");
		type=sc.next();
		System.out.println("Enter Balance:"+" ");
		total=sc.nextLong();
		
	}
	
	public void showData()
	{
		System.out.println("Name:"+ name);
		System.out.println("Account No:"+ account_number);
		System.out.println("Account tyype:"+ type);
		System.out.println("Balance:"+ total);
	}
	
	public void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter amount to be Deposited");
		amount=sc.nextLong();
	}
	
	public void showBalance()
	{
		total = total+amount;
		System.out.println("\nTotal balance is: "+ total);
	}
	
	public void withdrawl()
	{
		Scanner sc = new Scanner(System.in);
		int transaction;
		int available_balance = 0;
		System.out.println("Enter amount to withdraw");
		transaction = sc.nextInt();
		if(transaction>total)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			available_balance = (int) (total - transaction);
			System.out.println("Balance after withdrawl is: "+ available_balance);
			
		}
		
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setValue();
		bank.showData();
		bank.deposit();
		bank.showBalance();
		bank.withdrawl();

	}

}
