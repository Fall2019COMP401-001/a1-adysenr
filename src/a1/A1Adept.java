package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// store items and prices
		
		int oglength = scan.nextInt();
		
		String[] storeitems = new String[oglength];
		
		double[] price = new double[oglength];
		
		
		for (int i=0; i < oglength; i++) {
			storeitems[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		
		int customersTotal = scan.nextInt();
		
		String[] customers = new String[customersTotal];
		double[] total = new double[customersTotal];
		
		for (int j=0; j < customersTotal; j++) {
			
			customers[j] = (scan.next() + " " + scan.next());
			
			int purchased = scan.nextInt();
			
			double charge = 0;
			
			for (int k=0; k < purchased; k++) {
				int quantity = scan.nextInt();
				
				String item = scan.next();
			
				int index = 0;
				
				for (int l=0; l < storeitems.length; l++) {
				
					if ((storeitems[l]).equals(item)) {
						index = l;
					}
				}
				
				double itemBought = price[index];
				charge = (quantity * itemBought) + charge;
				total[j] = charge;
			}
		}
		
		int indexBiggest = 0;
		int indexSmallest = 0;
		double biggest = total[0];
		double smallest = total[0];
		
		for(int i = 0; i < total.length; i++) {
			if(total[i] > biggest) {
				biggest = total[i];
				indexBiggest = i;
			}
			if(total[i] < smallest) {
				smallest = total[i];
				indexSmallest = i;
			}
		}
		double average = 0;
		
		for (int i=0; i < total.length; i++) {
			average = average + total[i];
		}
		average = average / total.length;
		
		

		System.out.println("Biggest: " + customers[indexBiggest] + " (" + total[indexBiggest] + ")");
		System.out.println("Smallest: " + customers[indexSmallest] + " (" + total[indexSmallest] + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
		
	}
}
