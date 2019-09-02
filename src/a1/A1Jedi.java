package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int stockNumber = scan.nextInt();
		
		String[] stockItems = new String[stockNumber];
		
		
		
		int[] boughtStock = new int[stockNumber];
		int[] customersPurchased = new int[stockNumber];
		
		
		for (int i=0; i < stockNumber; i++) {
			stockItems[i] = scan.next();
			scan.nextDouble();	
		}
		
		int totalCustomers = scan.nextInt();
		
		for(int i=0; i < totalCustomers; i++) {
			scan.next();
			scan.next();
			
			int customerItems = scan.nextInt();
			
			
			for(int j=0; j < customerItems; j++) {
				
				int quantity = scan.nextInt();
				String item = scan.next();
				
				for(int k=0; k < stockItems.length; k++) {
					
					if(stockItems[k].equals(item)) {
						if(customersPurchased[k] <= i) {
							customersPurchased[k] = customersPurchased[k] + 1;
							if(customersPurchased[k] == 3) {
								customersPurchased[k] = 1;
							}
					}
					boughtStock[k] = customerItems + boughtStock[k];
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
