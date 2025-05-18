package tPointTech;

import  java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to reverse it: ");
		num = s.nextInt();
		
		printReverseNum(num);
		s.close();

	}
	
	public static void printReverseNum(int num)
	{
		
		int reversed = 0;
		while(num > 0) {
		    int digit = num % 10;
		    reversed = reversed * 10 + digit;
		    num = num / 10;
		}
		System.out.println("The reversed number is: " + reversed);

	}

}
