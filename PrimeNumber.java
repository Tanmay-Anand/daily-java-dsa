package tPointTech;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = s.nextInt();
		
		CheckPrimeNumber(num);
		s.close(); // good practice
	}
	
	public static void CheckPrimeNumber(int num) {
		
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println("It is a Prime Number.");
		} else {
			System.out.println("It is NOT a Prime Number.");
		}
	}
}