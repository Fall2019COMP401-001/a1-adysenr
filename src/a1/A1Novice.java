package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		
		
		for (int i=1; i<=count; i++) {
			
			double total = 0;
			char first = scan.next().charAt(0);
			String last = scan.next();
			int items = scan.nextInt();
			
			
			for (int j=1; j<=items; j++) {
				int quantity = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				double subtotal = (quantity * price);
				total = total + subtotal;
			}
				
			System.out.println(first + ". " + last + ": " + String.format("%.2f", total));
			
			}
			
			
		}
		
	}
