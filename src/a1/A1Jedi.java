package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int stockNumber = scan.nextInt();
		
		String[] stockItems = new String[stockNumber];
		
		for (int i=0; i < stockNumber; i++) {
			stockItems[i] = scan.next();
			scan.nextDouble();	
		}
		
		int[] boughtStock = new int[stockNumber];
		int[] customersPurchased = new int[stockNumber];
		
		int totalCustomers = scan.nextInt();
		String[] customerName = new String[totalCustomers];
		
		for(int i=0; i < totalCustomers; i++) {
			customerName[i] = scan.next();
			scan.next();
			
			int customerItems = scan.nextInt();
			
			for(i=0; i < customerItems; i++) {
				int quantityItem = 0;
				int quantity = scan.nextInt();
				String item = scan.next();
				
				for(i=0; i < stockItems.length; i++) {
					
					if(stockItems[i].equals(item)) {
						boughtStock[i] = boughtStock[i] + quantityItem;
						customersPurchased[i]++;
						if(customersPurchased[i] == 3) {
							customersPurchased[i] = 1;
						}
								
					}
				}
				
			}
		}
		
		for(int i =0; i < stockItems.length; i++) {
			if(boughtStock[i] > 0) {
				System.out.println(customersPurchased[i] + " customers bought " + boughtStock[i] + " " + stockItems[i]);
			} else if (boughtStock[i] == 0) {
				System.out.println("No customers bought " + stockItems[i]);
			}
		}
		
		
		
	}
}
