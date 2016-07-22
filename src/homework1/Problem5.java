package homework1;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bill Amount: $");
		double amount = input.nextDouble();
		System.out.print("Tip amount: $");
		double tip = input.nextDouble();
		System.out.print("Number of People: ");
		int ppl = input.nextInt();
		
		double total = 0;
		total = ((amount*.085)+(tip+amount))/ppl;
		
		System.out.printf("Your total comes out to: $%.2f",total);
		input.close();
	}
}
