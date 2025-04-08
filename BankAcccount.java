import java.util.Scanner;

public class BankAcccount{
	String accountName = "John Edward";
	String accountNumber = "4590468934";
	double accountBalance = 94746.66;
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount ();
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Welcome to UBA Bank");
		System.out.println("Enter 1 to withdraw");
		System.out.println("Enter 2 to deposit");
		
		System.out.print("Enter your choice");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
		
		        System.out.printf("Account name is %s%n",bank.accountName);
		        int amount = input.nextInt();
		
                bank.withdrawal(amount); 		
		        System.out.printf("Account name is %s%n",bank.accountNumber);
		        System.out.printf("Account name is %.2f%n",bank.accountBalance);
				System.out.printf("Your balance is %.2f%n",bank.accountBalance);
		
		    } 
			break;
			
			case 2:
			{
				System.out.printf("Enter amount to deposit");
		        int amount = input.nextInt();
		
                bank.deposit(amount); 		
		        System.out.printf("Account name is %s%n",bank.accountNumber);
		        System.out.printf("Account name is %.2f%n",bank.accountBalance);
				System.out.printf("Your balance is %.2f%n",bank.accountBalance);
		
			}
			break;
			default:
			
			System.out.ptintln("Invalid Input");
		}
	}
	
	public double withdrawal(int amount) {
		accountbalance -= amount;
		
		return accountBalance;
	}	
	
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
}	
		
		
	