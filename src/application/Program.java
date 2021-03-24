package application;

import java.util.Scanner;
import entitites.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		int op;
		
		System.out.println("Enter account number: ");
		int numberAccount = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit? (y/n)");
		char x = sc.next().charAt(0);
		if (x == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(numberAccount, holder, initialDeposit);
		} else {
			account = new Account(numberAccount, holder);
		}
		
		System.out.printf("\nAccount data: \n");
		System.out.println(account);
		
		do {
			Menu();
			op = sc.nextInt();
			
			switch(op) {
			case 1: 
				System.out.printf("Enter a deposit value: ");
				double depositValue = sc.nextDouble();
				account.deposit(depositValue);
				System.out.println("Updated account data");
				System.out.println(account);
				break;
			case 2:
				System.out.printf("Enter a withdraw value: ");
				double withdraw = sc.nextDouble();
				account.withdraw(withdraw);
				System.out.println("Updated account data");
				System.out.println(account);
				break;
			case 3:
				System.out.println("Until next time!");
				break;
			default: 
				System.out.println("This function doesnt exist");
				break;
			}
		} while (op != 3);
		
		sc.close();
	}
	
	public static void Menu () {
		System.out.println("----MENU----");
		System.out.println("1 - Deposit");
		System.out.println("2 - WithDraw");
		System.out.println("3 - Finish");
	}



}
