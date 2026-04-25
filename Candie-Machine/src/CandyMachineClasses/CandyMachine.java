package CandyMachineClasses;

import java.util.Scanner;

public class CandyMachine {
	public static void main(String[] args) {
		CashRegister cashRegister = new CashRegister();
		Dispenser candy = new Dispenser(100, 50);
		Dispenser chips = new Dispenser(100, 65);
		Dispenser gum = new Dispenser(75, 45);
		Dispenser cookies = new Dispenser(100, 85);
		int choice;
		
		Scanner input = new Scanner(System.in);
		showSelection();
		choice = input.nextInt();
		
		while (choice != 9) {
			switch (choice) {
				case 1:
					sellProduct(candy, cashRegister);
					break;
				case 2:
					sellProduct(chips, cashRegister);
					break;
				case 3:
					sellProduct(gum, cashRegister);
					break;
				case 4:
					sellProduct(cookies, cashRegister);
					break;
				default:
				System.out.println("Invalid Selection");
			}
			showSelection();
			choice = input.nextInt();
		}
		
		input.close();
	}
	
	public static void showSelection() {
		System.out.println("*** Welcome to Shelly's Candy Shop ***");
	
		System.out.println("To select an item, ente:");
		System.out.println(" 1 for Candy");
		System.out.println(" 2 for Chips");
		System.out.println(" 3 for Gum");
		System.out.println(" 4 for Cookies");
		System.out.println(" 9 to exit");
	}
	
	public static void sellProduct(Dispenser product, CashRegister cRegister) {
		int price;
		int coinsInserted;
		int coinsRequired;
		
		Scanner input = new Scanner(System.in);

		if (product.getCount() > 0) {
			price = product.getProductCost();
			coinsRequired = price;
			coinsInserted = 0;
			
			while (coinsRequired > 0) {
				System.out.print("Please deposit " + coinsRequired + " cents: ");	
				coinsInserted += input.nextInt();
				coinsRequired = price - coinsInserted;
			}
			
			System.out.println();
			cRegister.acceptAmount(coinsInserted);
			product.makeSale();
			System.out.println("Collect your item at the bottom and enjoy.\n");
		}
		else
			System.out.println("Sorry this item is sold out.\n");
	}
}

